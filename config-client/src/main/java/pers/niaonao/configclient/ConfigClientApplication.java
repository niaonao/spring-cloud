package pers.niaonao.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: ConfigClientApplication
 * @description: 客户端应用程序启动类
 * @author: niaonao
 * @date: 2019/11/5
 **/
@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        log.info("[配置中心]：客户端启动！");
    }

}
