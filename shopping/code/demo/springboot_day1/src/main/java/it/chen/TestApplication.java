package it.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration//启动springboot应用的自动配置
@ComponentScan//扫描该类所在的包，及其子包
@SpringBootApplication//相当与 @EnableAutoConfiguration @ComponentScan @SpringBootConfiguration：声明其为java配置类三个注解
//引导类：springboot应用入口
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }

}
