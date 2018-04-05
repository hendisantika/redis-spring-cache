package com.hendisantika.redisspringcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * Project : redis-spring-cache
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/04/18
 * Time: 08.09
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> template;

    public Object getValue(final String key) {
        return template.opsForValue().get(key);
    }

    public void setValue(final String key, final String value) {
        template.opsForValue().set(key, value);

        // set a expire for a message
        template.expire(key, 5, TimeUnit.SECONDS);
    }

}