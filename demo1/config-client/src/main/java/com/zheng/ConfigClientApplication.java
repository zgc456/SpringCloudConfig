package com.zheng;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/3/12.
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    //读取配置文件
    @Value("spring.datasource.username")
    public String username;
    @Value("spring.datasource.password")
    public String password;
    @Value("spring.datasource.url")
    public String url;
    @Value("spring.datasource.driver-class-name")
    public String driver;
    @GetMapping("driver")
    public String driver(){
        return this.driver;
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
