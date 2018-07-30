package com.superzzc93.service.impl;

import com.superzzc93.dao.ProductDao;
import com.superzzc93.domain.Product;
import com.superzzc93.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description
 * @Author superzzc93
 * @Date 2018/7/29 20:08
 * @Version 1.0
 */


@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public List<Product> getAllProduct() {
        List<Product> list = productDao.getAllProduct();
        return list;
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public Product getProductByID(String id) {
        return productDao.getProductByID(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);

    }

    @Override
    public void deleteProduct(String[] ids) {
        for (String id : ids) {
            productDao.deleteProduct(id);
        }
    }
}
