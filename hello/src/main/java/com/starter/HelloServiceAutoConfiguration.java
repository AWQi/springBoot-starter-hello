package com.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloServicePropertise.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello",value = "enable" , matchIfMissing = true)
public class HelloServiceAutoConfiguration {
@Autowired
private  HelloServicePropertise helloServicePropertise;
@Bean
@ConditionalOnMissingBean(HelloService.class)
public  HelloService helloService(){
    HelloService helloService = new HelloService();
    helloService.setMsg(helloServicePropertise.getMsg());
    return  helloService;
}

}
