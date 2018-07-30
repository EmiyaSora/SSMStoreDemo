package com.superzzc93.dao;

import com.superzzc93.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName ProductDao
 * @Description
 * @Author superzzc93
 * @Date 2018/7/29 20:07
 * @Version 1.0
 */

public interface ProductDao {

    @Select("select * from product")
    List<Product> getAllProduct();

    @Insert("insert into product (productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void addProduct(Product product);

    @Select("select * from product where id=#{id}")
    Product getProductByID(String id);

    @Update("update product set productNum = #{productNum},productName=#{productName},cityName=#{cityName}," +
            "departureTime=#{departureTime},productPrice=#{productPrice},productDesc=#{productDesc},productStatus=#{productStatus} " +
            "where id = #{id}")
    void updateProduct(Product product);

    @Delete("delete from product where id=#{id}")
    void deleteProduct(String id);
}
