package day4Assignment3.Entities;

import day4Assignment3.Abstract.Entity;

public class User implements Entity{

	private int id;
	private String email;
	
	public User() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
