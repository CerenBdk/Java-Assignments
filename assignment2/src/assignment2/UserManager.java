package assignment2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been updated.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been deleted.");
	}
	
}
