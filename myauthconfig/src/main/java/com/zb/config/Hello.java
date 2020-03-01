package com.zb.config;

/**
 * 核心事件类
 */
public class Hello {
    private String outMsg;

    public String sayHello() {
        return "hello:" + outMsg;
    }

    public String getOutMsg() {
        return outMsg;
    }

    public void setOutMsg(String outMsg) {
        this.outMsg = outMsg;
    }
}
