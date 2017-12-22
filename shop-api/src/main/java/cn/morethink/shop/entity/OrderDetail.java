package cn.morethink.shop.entity;

import java.io.Serializable;

/**
 * @author 李文浩
 * @date 2017/12/22
 */
public class OrderDetail implements Serializable {
    private int id;
    private int orderId;
    private int commodityId;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
