package com.bjpowernode.serviceImpl;

import com.bjpowernode.model.Order;
import com.bjpowernode.service.OrderService;

import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    public Order creatOrder(String name, String userId) {
        return new Order(UUID.randomUUID().toString(),name,userId);
    }
}
