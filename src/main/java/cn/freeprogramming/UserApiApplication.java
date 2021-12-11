package cn.freeprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author humorchen
 * @date 2021/12/6 1:20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class UserApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class,args);
    }
}
