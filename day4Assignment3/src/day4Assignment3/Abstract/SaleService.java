package day4Assignment3.Abstract;

import day4Assignment3.Entities.Campaign;
import day4Assignment3.Entities.Game;
import day4Assignment3.Entities.Gamer;

public interface SaleService {
	
	void sale(Gamer gamer, Game game, Campaign campaign);
	
}
