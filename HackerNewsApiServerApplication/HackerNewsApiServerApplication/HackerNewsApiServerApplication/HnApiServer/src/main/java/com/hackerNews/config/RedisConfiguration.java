package com.hackerNews.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Class for handling Redis connection
 * 
 * @author Pragya Jha
 *
 */
@Configuration
@EnableRedisRepositories
public class RedisConfiguration {

	/**
	 * Create the Redis Connection configuration
	 */
	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
		config.setHostName("redisapp");
		config.setPort(6379);
		return new LettuceConnectionFactory(config);
	}

	/**
	 * Initialize RedisTemplate
	 */
	@Bean
	public RedisTemplate<?, ?> redisTemplate() {
		RedisTemplate<String, String> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory());
		return template;
	}

}
