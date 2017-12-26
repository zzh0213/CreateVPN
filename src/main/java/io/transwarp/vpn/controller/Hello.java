package io.transwarp.vpn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zehao.zhang
 * @Description:
 * @Date: Created in 13:34 2017/12/26
 * @Modified By:
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
