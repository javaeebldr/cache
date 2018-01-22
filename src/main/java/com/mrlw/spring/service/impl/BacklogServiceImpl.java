package com.mrlw.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.mrlw.spring.model.Backlog;
import com.mrlw.spring.service.BacklogService;
import com.mrlw.spring.util.DataSource;

public class BacklogServiceImpl implements BacklogService {

	private static List<Backlog> backlogs = new ArrayList<Backlog>();

	static {
		backlogs = DataSource.populateData();
	}

	@Cacheable(value = "backlogs", key = "#name")
	public Backlog getByName(String name) {
		for(Backlog backlog : backlogs) {
			if(backlog.getName().equalsIgnoreCase(name)) {
				return backlog;
			}
		}
		return null;
	}

	@CacheEvict(value = "backlogs", allEntries = true)
	public void resetBacklogs() {
		
	}

	public Backlog update(Backlog backlog) {
		return null;
	}
	
}
