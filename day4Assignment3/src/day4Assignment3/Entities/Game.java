package day4Assignment3.Entities;

import day4Assignment3.Abstract.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private String type;
	private double price;
	private int releaseYear;
	private String description;
	
	public Game(int id, String name, String type, double price, int releaseYear, String description) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.releaseYear = releaseYear;
		this.description = description;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
