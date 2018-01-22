package com.mrlw.spring.model;

import java.io.Serializable;

public class Backlog implements Serializable {

	private static final long serialVersionUID = -191252311122061190L;

	private int id;
	private String name;

	public Backlog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Id : " + id + " , Name : " + name;
	}

}
