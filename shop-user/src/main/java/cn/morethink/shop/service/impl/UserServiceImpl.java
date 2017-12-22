package cn.morethink.shop.service.impl;

import cn.morethink.shop.dao.UserDao;
import cn.morethink.shop.entity.User;
import cn.morethink.shop.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 李文浩
 * @date 2017/12/21
 */

@Service(timeout = 5000)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
