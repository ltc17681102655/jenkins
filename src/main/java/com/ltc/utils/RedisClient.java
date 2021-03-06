package com.ltc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisClient {

    @Autowired
    private StringRedisTemplate redisTpl;

    /**
     * 功能描述：设置key-value到redis中
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {
        try {
            redisTpl.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


    /**
     * 功能描述：通过key获取缓存里面的值
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return redisTpl.opsForValue().get(key);
    }
}
