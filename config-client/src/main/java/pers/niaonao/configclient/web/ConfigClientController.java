package pers.niaonao.configclient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

/**
 * @className: ConfigClientController
 * @description: 测试外部属性控制类
 * @author: niaonao
 * @date: 2019/11/5
 **/
@RestController
@RequestMapping(value = "/config/client")
public class ConfigClientController {
    @Value("${account}")
    private String account;
    @Value("${repositoryUrl}")
    private String repositoryUrl;

    @GetMapping("/getRepositoryUrl")
    public String getRepositoryUrl() {
        StringBuilder resultUrl = new StringBuilder("Account：");
        resultUrl.append(account)
                .append("<br/>")
                .append("RepositoryUrl：")
                .append(repositoryUrl);
        return resultUrl.toString();
    }
}
