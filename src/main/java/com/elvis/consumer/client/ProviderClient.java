package com.elvis.consumer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/hello")
    String hi(@RequestParam(value = "name", defaultValue = "JackRen", required = false) String name);

}
