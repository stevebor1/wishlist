package org.psoft.wishlist.dao.data;

public class Account {

	final int id;
	
	final String email;

	String name;
	
	public Account(String name, String email) {
		this.id = -1;
		this.name = name;
		this.email = email;
	}

	public Account(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}