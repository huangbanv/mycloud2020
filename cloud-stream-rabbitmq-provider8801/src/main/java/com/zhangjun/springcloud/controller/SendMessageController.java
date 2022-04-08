package com.zhangjun.springcloud.controller;

import com.zhangjun.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-08 17:23
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
