package com.mrlw.spring.service;

import com.mrlw.spring.model.Backlog;

public interface BacklogService {

	Backlog getByName(String name);

	void resetBacklogs();
	
	Backlog update(Backlog backlog);

}
