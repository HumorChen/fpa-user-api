package cn.programming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author humorchen
 * @date 2021/12/6 1:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class,null);
    }
}
