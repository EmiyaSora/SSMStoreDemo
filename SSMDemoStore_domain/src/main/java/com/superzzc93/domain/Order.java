package com.superzzc93.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Order
 * @Description
 * @Author superzzc93
 * @Date 2018/7/30 8:57
 * @Version 1.0
 */


public class Order implements Serializable{

        private String id;
        private String orderNum;
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
        private Date orderTime;
        private Integer peopleCount;
        private String orderDesc;
        private Integer payType;
        private Integer orderStatus;
        // 外键
        private String productId;
        private Product product;

        @Override
        public String toString() {
            return "Order{" +
                    "id='" + id + '\'' +
                    ", orderNum='" + orderNum + '\'' +
                    ", orderTime=" + orderTime +
                    ", peopleCount=" + peopleCount +
                    ", orderDesc='" + orderDesc + '\'' +
                    ", payType=" + payType +
                    ", orderStatus=" + orderStatus +
                    ", productId=" + productId +
                    ", product=" + product +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(String orderNum) {
            this.orderNum = orderNum;
        }

        public Date getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(Date orderTime) {
            this.orderTime = orderTime;
        }

        public Integer getPeopleCount() {
            return peopleCount;
        }

        public void setPeopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
        }

        public String getOrderDesc() {
            return orderDesc;
        }

        public void setOrderDesc(String orderDesc) {
            this.orderDesc = orderDesc;
        }

        public Integer getPayType() {
            return payType;
        }

        public void setPayType(Integer payType) {
            this.payType = payType;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }
    }
