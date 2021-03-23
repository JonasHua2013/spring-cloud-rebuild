package com.heyxiang.spring.cloud.consumer.feign.fallback;

import com.heyxiang.spring.cloud.consumer.feign.ProducerClient;
import org.springframework.stereotype.Component;

/**
 * @author huachao
 * @desc 描述
 * @date 2021年03月23日 10:43
 */
@Component
public class ProducerFallback implements ProducerClient {
    @Override
    public String sayHi() {
        return "服务走到降级逻辑";
    }
}
