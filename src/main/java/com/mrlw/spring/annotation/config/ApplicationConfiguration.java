package com.mrlw.spring.annotation.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@EnableCaching
@Configuration
@ComponentScan(basePackages = "com.mrlw.spring")
public class ApplicationConfiguration {

	@Bean
	public CacheManager manager() {
		return new EhCacheCacheManager(ehManager().getObject());
	}
	
	@Bean
	public EhCacheManagerFactoryBean ehManager() {
		EhCacheManagerFactoryBean factory = new EhCacheManagerFactoryBean();
		factory.setConfigLocation(new ClassPathResource("ehcache.xml"));
		return factory;
	}
}
