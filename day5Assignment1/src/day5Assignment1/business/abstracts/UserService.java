package day5Assignment1.business.abstracts;

import java.util.List;

import day5Assignment1.entities.concretes.User;

public interface UserService {

	boolean add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getall();
	User getByEmail(String email);
	
}
