package com.superzzc93.service.impl;

import com.superzzc93.dao.OrderDao;
import com.superzzc93.domain.Order;
import com.superzzc93.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author superzzc93
 * @Date 2018/7/30 9:17
 * @Version 1.0
 */

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getAllOrder() {
        return orderDao.getAllOrder();
    }
}
