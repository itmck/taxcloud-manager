package com.syun.controller.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Create by it_mck 2018/11/11 21:47
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("r")
public class RedisController {

    @Autowired
    private JedisPool jedisPool;//注入jedisPool
    @RequestMapping("n")
    @ResponseBody
    public String getString(){
        String name = null;
        try {
            Jedis resource = jedisPool.getResource();
            name = resource.get("name");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedisPool.close();
        }
        return name;
    }
}
