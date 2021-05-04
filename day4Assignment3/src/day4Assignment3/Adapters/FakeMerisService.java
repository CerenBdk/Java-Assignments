package day4Assignment3.Adapters;

import day4Assignment3.Abstract.CheckUserService;
import day4Assignment3.Entities.Gamer;
import day4Assignment3.Mernis.PersonValidation;

public class FakeMerisService implements CheckUserService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		PersonValidation checkPerson = new PersonValidation();
		
		boolean result = true;
		try {
			result = checkPerson.ValidateByPersonalInfo(Long. parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
