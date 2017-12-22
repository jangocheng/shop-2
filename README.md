此项目模拟电商系统，分为用户中心，订单中心，还有一个公共api中心。
- shop-api
- shop-user
- shop-order

shop-user和shop-order采用Spring Boot + Mybatis 部署为一个web应用，同时shop-user向shop-order提供UserService服务。

shop-user得到用户信息：

![](https://images.morethink.cn/b73eacb2fbfa9a71702dcb7fb00822f6.png)


shop-order得到订单信息：

![](https://images.morethink.cn/db27fab1b1e3c4a7d10335c2c47033ba.png)

shop-order访问shop-user的UserService服务：


![](https://images.morethink.cn/7a7b3b1890f3cf970c20cc9cda80f1ec.png)
