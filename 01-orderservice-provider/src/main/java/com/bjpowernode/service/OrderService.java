package com.bjpowernode.service;

import com.bjpowernode.model.Order;

public interface OrderService {
    Order createOrder(Integer userid,String goodsName);
}
