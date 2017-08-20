package com.lz.remoter;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhi on 2017/8/19.
 */
@Component
public class HelloRemoteHystrix implements  HelloRemote {

    @Override
    public String Hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
