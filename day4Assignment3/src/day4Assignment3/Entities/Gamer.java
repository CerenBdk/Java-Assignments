package day4Assignment3.Entities;

import java.time.LocalDate;

public class Gamer extends User{

	private int userid;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalId;
	
	public Gamer() {

	}
	
	public Gamer(int userid, String firstName, String lastName, LocalDate dateOfBirth, String nationalId) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
}
