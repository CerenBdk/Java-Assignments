package day5Assignment1;

import java.util.Scanner;

import day5Assignment1.business.abstracts.AuthService;
import day5Assignment1.business.concretes.AuthManager;
import day5Assignment1.business.concretes.UserManager;
import day5Assignment1.core.concretes.GoogleManagerAdapter;
import day5Assignment1.core.concretes.VerificationLink;
import day5Assignment1.dataAccess.concretes.InMemoryUserDao;
import day5Assignment1.google.GoogleManager;

public class Main {

	private static boolean flag = true;
	private static Scanner in = new Scanner(System.in);
	static AuthService authService = new AuthManager( new UserManager(new InMemoryUserDao()), new GoogleManagerAdapter(), new VerificationLink());
	
	public static void main(String[] args) {
		
		dashboard();
		
//		GoogleManager g = new GoogleManager();
//		g.register("test1@test1.com", "test123");
		
		//authService.registerGoogle("test1@test1.com", "test123");
		
	}
	
	public static void dashboard() {
		
		while (flag)
        {
            System.out.println("\n*************** Main Menu ***************");
            System.out.println("          1. User Register");
            System.out.println("          2. User Register With Google");
            System.out.println("          3. User Login");
            System.out.println("          4. Exit \n");
            
            int key = in.nextInt();
            switch (key)
            {
                case 1:
                    Register();
                    break;
                case 2:
                    RegisterGoogleAccount();
                    break;
                case 3:
                    Login();
                    break;
                case 4:
                	System.out.println("*************** Have a nice day. Good Bye :) ***************");
                    flag = false;
                    break;
                default:
                	System.out.println("\nYou entered an incorrect value! Please try again.");
                    break;
            }
        }
		
	}
	
	private static void Register() {
		
		System.out.println("First Name: ");
		String firstName = in.next();
		
		System.out.println("Last Name: ");
		String lastName = in.next();
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.register(firstName, lastName, email, password);
		
	}
	
	private static void RegisterGoogleAccount() {
		
		System.out.println("Email Address: ");
		String email = in.next().toString();
		
		System.out.println("Password: ");
		String password = in.next().toString();
		
		authService.registerGoogle(email, password);
	}
	
	private static void Login() {
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.login(email, password);
	}
}
