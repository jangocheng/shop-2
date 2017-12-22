package cn.morethink.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 李文浩
 * @date 2017/12/21
 */


@SpringBootApplication
@ComponentScan(basePackages = "cn.morethink.shop")
@MapperScan("cn.morethink.shop.dao")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
