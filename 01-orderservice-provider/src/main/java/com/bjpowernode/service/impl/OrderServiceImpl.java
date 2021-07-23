package com.bjpowernode.service.impl;

import com.bjpowernode.model.Order;
import com.bjpowernode.service.OrderService;

import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    public Order createOrder(Integer userid, String goodsName) {
        Order order = new Order();
        order.setId(UUID.randomUUID().toString());
        order.setUserId(userid);
        order.setName(goodsName);
        return order;
    }
}
