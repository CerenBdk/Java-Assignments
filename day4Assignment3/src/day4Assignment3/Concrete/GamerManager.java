package day4Assignment3.Concrete;

import day4Assignment3.Abstract.CheckUserService;
import day4Assignment3.Abstract.GamerService;
import day4Assignment3.Entities.Gamer;

public class GamerManager implements GamerService{

	private CheckUserService checkUserService;
	
	public GamerManager(CheckUserService checkUserService) {
		this.checkUserService = checkUserService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(checkUserService.CheckIfRealPerson(gamer)){
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "has been added.");
		}else {
			System.out.println("Something went wrong. Operation failed.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "has been deleted.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "has been updated.");
	}
}
