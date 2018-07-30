package com.superzzc93.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superzzc93.domain.Product;
import com.superzzc93.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description
 * @Author superzzc93
 * @Date 2018/7/29 20:10
 * @Version 1.0
 */

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /* *
     * @Author superzzc93
     * @Description 获取商品列表的控制器
     * @Date 21:15 2018/7/29
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("getAllProduct.do")
    public ModelAndView getAllProduct(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "5") int pageSize) {
        ModelAndView mv = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<Product> list = productService.getAllProduct();
        PageInfo<Product> page = new PageInfo<>(list);
//        System.out.println(list);
        mv.addObject("page", page);
        mv.setViewName("product-list");
        return mv;
    }

    /* *
     * @Author superzzc93
     * @Description 跳转到添加商品页面的方法
     * @Date 22:05 2018/7/29
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("toAddProduct.do")
    public String toAddProduct(){
        return "product-add";
    }

    /* *
     * @Author superzzc93
     * @Description 填加商品的方法
     * @Date 22:06 2018/7/29
     * @Param [product]
     * @return java.lang.String
     **/
    @RequestMapping("addProduct.do")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/product/getAllProduct.do";
    }

    /* *
     * @Author superzzc93
     * @Description 跳转商品修改页面并进行信息回显的方法
     * @Date 22:50 2018/7/29
     * @Param [id]
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("toUpdate.do")
    public ModelAndView toUpdate(String id){
//        System.out.println(id);
        ModelAndView mv = new ModelAndView();
        Product product = productService.getProductByID(id);
        mv.addObject("product", product);
        mv.setViewName("product-update");
        return mv;
    }

    /* *
     * @Author superzzc93
     * @Description 修改上商品信息的方法
     * @Date 22:49 2018/7/29
     * @Param [product]
     * @return java.lang.String
     **/
    @RequestMapping("updateProduct.do")
    public String updateProduct(Product product) {
        productService.updateProduct(product);
        return "redirect:/product/getAllProduct.do";
    }

    @RequestMapping("delete.do")
    public String deleteProduct(String[] ids) {
        for (String id : ids) {
            System.out.println(id);
        }
        productService.deleteProduct(ids);
        return "redirect:/product/getAllProduct.do";
    }
}
