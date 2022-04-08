package com.zhangjun.springcloud.service;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-08 17:18
 */
public interface IMessageProvider {
    /**
     * 发送方法
     * @return 序列号
     */
    public String send() ;
}
