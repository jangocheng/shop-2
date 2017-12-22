package cn.morethink.shop.action;

import cn.morethink.shop.service.UserService;
import cn.morethink.shop.util.Result;
import cn.morethink.shop.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文浩
 * @date 2017/12/22
 */

@RestController
@RequestMapping("users")
public class UserAction {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public Result getUser(@PathVariable int id) {
        return ResultUtil.successResult(userService.getUser(id));
    }

}
