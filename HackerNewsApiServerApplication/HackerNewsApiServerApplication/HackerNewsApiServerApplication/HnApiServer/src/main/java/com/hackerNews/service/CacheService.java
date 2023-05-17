package com.hackerNews.service;

/**
 * Interface for getting and setting values from Cache
 * 
 * @author Pragya Jha
 *
 */
public interface CacheService {
	/**
	 * Set a value for a key in cache
	 */
	void set(String key, String value);

	/**
	 * Get a value from a key in cache
	 */
	Object get(String key);
}
