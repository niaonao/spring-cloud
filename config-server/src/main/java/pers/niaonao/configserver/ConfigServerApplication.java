package pers.niaonao.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: EnableConfigServer 声明为配置服务器（配置中心）
 *  支持：
 *      支持用于外部配置的基于资源的 HTTP API
 *      支持对称/非对称加密和解密的属性值
 *      支持注解 @EnableConfigServer 使用在 SpringBoot 应用程序
 *  功能：
 *      server提供配置文件的存储、以接口的形式将配置文件的内容提供出去，client通过接口获取数据、并依据此数据初始化自己的应用-
 * @author: niaonao
 * @date: 2019/11/5
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
@Slf4j
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        log.info("[配置中心]：服务端启动！");
    }

}
