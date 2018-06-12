package com.slc.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shileichao on 2018/6/12.
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${shouji}")
    private String shouji;

    @RequestMapping("/getSJ")
    public String getShouji(){
        return shouji;
    }
}
