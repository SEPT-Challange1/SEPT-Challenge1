package com.item.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description: Item
 * @Author:
 * @CreateDate: 2022/9/9 9:45
 * @Version: 1.0
 */
public class Item {

    @Id
    private String id;
    @Column(name = "`name`")
    private String name;
    @Column(name = "`desc`")
    private String desc;
    private double price;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
