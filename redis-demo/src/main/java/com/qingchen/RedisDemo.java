package com.qingchen;

import com.qingchen.util.JedisPoolUtil;
import redis.clients.jedis.Jedis;

/**
 * @author qingchen
 * @date 23/3/2023 下午 1:57
 */

public class RedisDemo {
    public static void main(String[] args) {
        Jedis jedis = JedisPoolUtil.getJedis();
        jedis.auth("177214");
        System.out.println("服务正在运行: " + jedis.ping());
        jedis.close();
    }
}
