package com.superzzc93.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superzzc93.domain.Order;
import com.superzzc93.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description
 * @Author superzzc93
 * @Date 2018/7/30 9:17
 * @Version 1.0
 */

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("getAllOrder.do")
    public ModelAndView getAllOrder(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "5") int pageSize) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("order-list");
        PageHelper.startPage(pageNum, pageSize);
        List<Order> list = orderService.getAllOrder();
        PageInfo<Order> page = new PageInfo<>(list);
        mv.addObject("page", page);
        return mv;
    }
}
