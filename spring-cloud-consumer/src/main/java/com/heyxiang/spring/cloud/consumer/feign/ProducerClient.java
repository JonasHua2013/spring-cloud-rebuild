package com.heyxiang.spring.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huachao
 * @desc 描述
 * @date 2021年03月22日 17:32
 */
@FeignClient("spring-cloud-producer")
public interface ProducerClient {

    @RequestMapping("/producer/say")
    public String sayHi();
}
