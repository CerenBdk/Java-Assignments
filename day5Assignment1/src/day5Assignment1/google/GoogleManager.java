package day5Assignment1.google;

import java.util.ArrayList;
import java.util.List;

import day5Assignment1.entities.concretes.User;

public class GoogleManager {
	 
	 static List<UserForGoogle> usersGoogle;
	
	public GoogleManager() {
		usersGoogle = new ArrayList<UserForGoogle>();
		usersGoogle.add(new UserForGoogle("test1", "test1", "test1@test1.com", "test123"));
		usersGoogle.add(new UserForGoogle("test2", "test2", "test2@test2.com", "test1223"));
		usersGoogle.add(new UserForGoogle("test3", "test3", "test3@test2.com", "test1432"));
		usersGoogle.add(new UserForGoogle("test4", "test4", "test4@test2.com", "test1335"));
	}
	
	public UserForGoogle register(String email, String password) {
		UserForGoogle user = null;
		for (UserForGoogle item : usersGoogle) {
			if(item.getEmail().equals(email) && item.getPassword().equals(password)) {
				user = item;
				break;
			}
		}
		return user;
	}	
}
