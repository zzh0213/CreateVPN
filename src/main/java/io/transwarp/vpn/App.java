package io.transwarp.vpn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zehao.zhang
 * @Description:
 * @Date: Created in 13:31 2017/12/26
 * @Modified By:
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "io.transwarp.vpn")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
