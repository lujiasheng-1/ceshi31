package com.zb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 属性类
 */
@Component
@ConfigurationProperties(prefix = "com.zb")
public class HelloProperties {
    private String msg = "hello springboot!";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
