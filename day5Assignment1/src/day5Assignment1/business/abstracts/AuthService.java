package day5Assignment1.business.abstracts;

public interface AuthService {

	void register(String firstName, String lastName, String email, String password);
	void registerGoogle(String firstName,String password);
	void login(String email, String password);
	void logOut();
}
