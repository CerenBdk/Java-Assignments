package day5Assignment1.gmail;

import java.util.ArrayList;
import java.util.List;

import day5Assignment1.entities.concretes.User;

public class GoogleManager {
	 
	 static List<User> usersGoogle;
	
	public GoogleManager() {
		usersGoogle = new ArrayList<User>();
		usersGoogle.add(new User("test1", "test1", "test1@test1.com", "test123"));
		usersGoogle.add(new User("test2", "test2", "test2@test2.com", "test1223"));
		usersGoogle.add(new User("test3", "test3", "test3@test2.com", "test1432"));
		usersGoogle.add(new User("test4", "test4", "test4@test2.com", "test1335"));
	}
	
	public User register(String email, String password) {
		User user = null;
		for (User item : usersGoogle) {
			if(item.getEmail().equals(email) && item.getPassword().equals(password)) {
				user = item;
				break;
			}
		}
		return user;
	}	
}
