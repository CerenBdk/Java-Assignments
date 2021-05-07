package day5Assignment1.core.abstracts;

import day5Assignment1.entities.concretes.User;

public interface RegisterService {
	User register(String email, String password);
}
