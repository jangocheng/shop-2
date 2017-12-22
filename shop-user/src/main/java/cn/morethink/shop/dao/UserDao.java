package cn.morethink.shop.dao;

import cn.morethink.shop.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 李文浩
 * @date 2017/12/21
 */

@Repository
public interface UserDao {
    User getUser(int id);
}
