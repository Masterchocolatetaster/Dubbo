package com.bjpowernode.service;

import com.bjpowernode.model.Order;

public interface OrderService {
    //创建订单
    public Order creatOrder(String name,String userId);
}
