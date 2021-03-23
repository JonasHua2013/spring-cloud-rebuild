package com.heyxiang.spring.cloud.consumer.feign;

import com.heyxiang.spring.cloud.consumer.feign.fallback.ProducerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huachao
 * @desc 描述
 * @date 2021年03月22日 17:32
 */
@FeignClient(value = "spring-cloud-producer",fallback = ProducerFallback.class)
public interface ProducerClient {

    @RequestMapping("/producer/say")
    public String sayHi();
}
