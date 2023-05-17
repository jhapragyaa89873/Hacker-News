package com.hackerNews.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.hackerNews.service.CacheService;

import lombok.extern.log4j.Log4j2;

/**
 * Implementation class for CacheService using RedisTemplate for caching data
 * 
 * @author Pragya Jha
 *
 */
@Log4j2
@Service
public class CacheServiceImpl implements CacheService {
	
	 private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(CacheServiceImpl.class);

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	/**
	 * Set a value for a key in cache
	 */
	public void set(String key, String value) {
		redisTemplate.opsForValue().set(key, value, 10, TimeUnit.MINUTES);
	}

	/**
	 * Get a value from a key in cache
	 */
	public Object get(String key) {
		try {
			return redisTemplate.opsForValue().get(key);
		} catch (Exception e) {
			log.error(e.toString());
		}
		return null;
	}

}
