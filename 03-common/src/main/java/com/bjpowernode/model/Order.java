package com.bjpowernode.model;

import java.io.Serializable;

public class Order implements Serializable {
    private String id;
    private String name;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public Order() {
    }

    public Order(String id, String name, String userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }
}
