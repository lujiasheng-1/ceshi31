package com.zb.config;

/**
 * 核心事件类
 */
public class Hello {
    //张三写了代码
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
