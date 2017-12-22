package cn.morethink.shop.service.impl;

import cn.morethink.shop.dao.OrderDao;
import cn.morethink.shop.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李文浩
 * @date 2017/12/22
 */

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public Order getOrder(int id) {
        return orderDao.getOrder(id);
    }
}
