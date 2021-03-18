package cn.web.sharding.jdbc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : wangebie
 * @date : 2021/3/17 17:09
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.web,sharding.jdbc.demo.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
