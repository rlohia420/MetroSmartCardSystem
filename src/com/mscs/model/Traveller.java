package com.mscs.model;

public class Traveller {
	 public Traveller(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	long id;
	String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
