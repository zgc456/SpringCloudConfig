package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lenovo on 2018/3/12.
 */
//激活该应用为配置文件服务器
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        /**
         *  http://localhost:8089/jdbc/properties 正确的访问方式
         *  http://localhost:8089/git的文件名/git上文件名后缀
         */
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
