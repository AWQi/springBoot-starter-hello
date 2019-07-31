package com.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloServicePropertise {


    private  static  final  String MSG = "Word";
    private  String msg = MSG;


    public  String  sayHello(){
        return  "Hello"+msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
