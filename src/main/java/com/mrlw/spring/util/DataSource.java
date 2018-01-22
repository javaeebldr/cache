package com.mrlw.spring.util;

import java.util.Arrays;
import java.util.List;

import com.mrlw.spring.model.Backlog;

public class DataSource {

	public static final List<Backlog> populateData() {
		return Arrays.asList(
				new Backlog(1, "Issue 147"),
				new Backlog(2, "Issue 29923"), 
				new Backlog(3, "Issue 9923"));
	}
}
