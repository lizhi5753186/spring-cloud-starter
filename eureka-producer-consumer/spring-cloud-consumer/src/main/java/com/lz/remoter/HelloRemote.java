package com.lz.remoter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhi on 2017/8/19.
 */
@FeignClient(name="spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String Hello(@RequestParam(value = "name") String name);

}
