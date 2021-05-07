package day5Assignment1.dataAccess.abstracts;

import java.util.List;

import day5Assignment1.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getall();
	User getByEmail(String email);
}
