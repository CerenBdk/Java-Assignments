package day5Assignment1.core.concretes;

import day5Assignment1.core.abstracts.RegisterService;
import day5Assignment1.entities.concretes.User;
import day5Assignment1.gmail.GoogleManager;

public class GoogleManagerAdapter implements RegisterService{

	@Override
	public User register(String email, String password) {
		GoogleManager googleManager = new GoogleManager();
		User user = null;
		user = googleManager.register(email, password);
		return user;
	}

}
