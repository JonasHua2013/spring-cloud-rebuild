package com.heyxiang.spring.cloud.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huachao
 * @desc 描述
 * @date 2021年03月22日 17:11
 */
@Controller
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "我是提供者发送的消息，嘿嘿嘿";
    }
}
