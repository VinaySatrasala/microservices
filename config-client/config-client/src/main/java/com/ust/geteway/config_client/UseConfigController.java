package com.ust.geteway.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/client")
public class UseConfigController {
    @Value("${server.port.key}")
    private String port;
//
//    @Value("${spring.application.name}")
//    private String appName;

    @GetMapping
    public String getConfig() {
        return port;
    }
}
