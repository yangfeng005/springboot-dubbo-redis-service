package com.jp.common.redis.service;

public interface IRedisService {

    /**
     * 设置key 不过期
     * @param key
     * @param value
     */
    void setKeyNoExpire(String key, String value);

    /**
     * 设置key-value
     * @param key
     * @param value
     */
    void setKey(String key, String value);

    /**
     * 获取key
     * @param key
     * @return
     */
    String getValue(String key);

    /**
     * 删除key
     * @param key
     */
    void delete(String key);
}
