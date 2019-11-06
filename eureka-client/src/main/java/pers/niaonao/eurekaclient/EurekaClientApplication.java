package pers.niaonao.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: EurekaClientApplication
 * @description: 注册中心客户端启动类
 * @author: niaonao
 * @date: 2019/11/5
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
@Slf4j
public class EurekaClientApplication {

    @RequestMapping("/")
    public String welcome() {
        return "Here is EurekaClientApplication";
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
        log.info("[注册中心]：客户端实例启动！");
    }

}
