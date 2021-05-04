package day4Assignment3.Concrete;

import day4Assignment3.Abstract.SaleService;
import day4Assignment3.Entities.Campaign;
import day4Assignment3.Entities.Game;
import day4Assignment3.Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		
		double discountedPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100);
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
				" bought " + game.getName() + " for $" + discountedPrice +
				" by taking advantage of the " + campaign.getTitle() + " campaign.");
	}

}
