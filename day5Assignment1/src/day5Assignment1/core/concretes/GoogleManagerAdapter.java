package day5Assignment1.core.concretes;

import day5Assignment1.core.abstracts.RegisterService;
import day5Assignment1.entities.concretes.User;
import day5Assignment1.gmail.GoogleManager;
import day5Assignment1.gmail.UserForGoogle;

public class GoogleManagerAdapter implements RegisterService{

	@Override
	public User register(String email, String password) {
		GoogleManager googleManager = new GoogleManager();
		UserForGoogle userForGoogle = googleManager.register(email, password);
		User user = new User(userForGoogle.getFirstName(),
				userForGoogle.getLastName(), userForGoogle.getEmail(),
				userForGoogle.getPassword());
		return user;
	}

}
