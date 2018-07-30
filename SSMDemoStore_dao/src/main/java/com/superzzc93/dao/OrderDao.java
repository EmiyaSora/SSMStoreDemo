package com.superzzc93.dao;

import com.superzzc93.domain.Order;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName OrderDao
 * @Description
 * @Author superzzc93
 * @Date 2018/7/30 9:18
 * @Version 1.0
 */

public interface OrderDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "ordernum"),
            @Result(property = "orderTime",column = "ordertime"),
            @Result(property = "peopleCount",column = "ordercount"),
            @Result(property = "orderDesc",column = "orderdesc"),
            @Result(property = "payType",column = "paytype"),
            @Result(property = "orderStatus",column = "orderstatus"),
            @Result(property = "productId",column = "productid"),
            @Result(property = "product",column = "productid",one = @One(
                    select = "com.superzzc93.dao.ProductDao.getProductByID"
            ))
    })
    List<Order> getAllOrder();
}
