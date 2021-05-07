package day5Assignment1.business.concretes;

import day5Assignment1.business.abstracts.AuthService;
import day5Assignment1.business.abstracts.UserService;
import day5Assignment1.core.abstracts.RegisterService;
import day5Assignment1.core.abstracts.VerificationService;
import day5Assignment1.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	private RegisterService registerService;
	private VerificationService verificationService;
	
	public AuthManager(UserService userService, RegisterService registerService, VerificationService verificationService) {
		this.userService = userService;
		this.registerService = registerService;
		this.verificationService = verificationService;
	}
	
	@Override
	public void register(String firstName, String lastName, String email, String password) {
		if(this.userService.add(new User(firstName, lastName, email, password))) {
			System.out.println("Register successful! Please verify your e-mail address with the link sent.");
			this.verificationService.send();
		}else {
			System.out.println("Register Failed");
		}
	}
	
	@Override
	public void registerGoogle(String email, String password) {
		if(this.registerService.register(email, password) != null) {
			this.userService.add(this.registerService.register(email, password));
			System.out.println("You have successfully registered with your Google account.");
		}else {
			System.out.println("There are no such users registered with Google.");
		}
	}	

	@Override
	public void login(String email, String password) {
		if(this.userService.getByEmail(email) != null) {
			if(this.userService.getByEmail(email).getEmail().equals(email) && this.userService.getByEmail(email).getPassword().equals(password)) {
				System.out.println("Login successful");
			}else {
				System.out.println("Your e-mail address or password is incorrect");
			}
		}else {
			System.out.println("This user is not registered.");
		}
	}

	@Override
	public void logOut() {
		System.out.println("Exit done");
	}
}
