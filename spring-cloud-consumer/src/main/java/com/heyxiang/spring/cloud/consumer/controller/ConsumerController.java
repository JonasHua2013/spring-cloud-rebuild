package com.heyxiang.spring.cloud.consumer.controller;

import com.heyxiang.spring.cloud.consumer.feign.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huachao
 * @desc 描述
 * @date 2021年03月22日 17:19
 */
@Controller
@RequestMapping("/comsumer")
public class ConsumerController {
    @Autowired
    ProducerClient producerClient;

    @RequestMapping("/getSay")
    @ResponseBody
    public String getSay(){
        return producerClient.sayHi();
    }
}
