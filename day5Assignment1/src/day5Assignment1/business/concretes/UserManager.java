package day5Assignment1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Assignment1.business.abstracts.UserService;
import day5Assignment1.dataAccess.abstracts.UserDao;
import day5Assignment1.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public boolean add(User user) {	
		
		boolean result = false;
		
		if(CheckIfEmailValid(user.getEmail()) && CheckIfEmailExists(user.getEmail())){
			 if(CheckIfPasswordValid(user.getPassword())){
				 if(CheckIfNameLengthValid(user.getFirstName(), user.getLastName())) {
					 this.userDao.add(user);
					// System.out.println("Your registration has been successfully completed (InMemory)");
					 result = true;
					 return result;
				 }else {
					 System.out.println("Your name and surname must consist of at least two letters.");
				 }
				 
			} else {
				System.out.println("Your password must be at least 6 characters.");
			}
			
		} else {
			result = false;
			System.out.println("Your email is invalid");
		}		
		return result;
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
	}

	@Override
	public List<User> getall() {
		return this.userDao.getall();
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	public boolean CheckIfPasswordValid(String password){
		boolean result = false;
		
		if(password.length() >= 6){
			result = true;
		}
	
		return result;
	}

	public boolean CheckIfEmailValid(String email) {
		boolean result = false;
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			result = true;
		}
		return result;
	}
	
	public boolean CheckIfEmailExists(String email) {
		boolean result = false;
		if(this.userDao.getByEmail(email) == null) {
			result = true;
		}
		return result;
	}
	
	public boolean CheckIfNameLengthValid(String firstName, String lastName) {
		boolean result = false;
		if(firstName.length() >=2 && lastName.length() >= 2){
			result = true;
		}
		return result;
	}
	
	
}
