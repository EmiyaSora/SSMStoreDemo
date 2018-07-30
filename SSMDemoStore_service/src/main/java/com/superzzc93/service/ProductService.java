package com.superzzc93.service;

import com.superzzc93.domain.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description
 * @Author superzzc93
 * @Date 2018/7/29 20:08
 * @Version 1.0
 */

public interface ProductService {
    List<Product> getAllProduct();

    void addProduct(Product product);

    Product getProductByID(String id);

    void updateProduct(Product product);

    void deleteProduct(String[] ids);

}
