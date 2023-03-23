package com.qingchen.util;

import redis.clients.jedis.Jedis;

/**
 * @author qingchen
 * @date 23/3/2023 上午 11:33
 */

public class RedisConnectionUtil {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("124.221.1.149", 6379);
        // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
        jedis.auth("177214");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
    }
}
