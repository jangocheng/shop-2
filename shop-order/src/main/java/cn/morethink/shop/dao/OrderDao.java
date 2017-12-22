package cn.morethink.shop.dao;

import cn.morethink.shop.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @author 李文浩
 * @date 2017/12/22
 */

@Repository
public interface OrderDao {
    Order getOrder(int id);
}
