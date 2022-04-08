package com.zhangjun.springcloud.service.Impl;

import com.zhangjun.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-08 17:19
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    /**
     * 消息的发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        // 创建并发送消息
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: "+serial);

        return serial;
    }

}
