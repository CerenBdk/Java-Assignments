package day4Assignment3;

import java.time.LocalDate;

import day4Assignment3.Adapters.FakeMerisService;
import day4Assignment3.Concrete.CampaignManager;
import day4Assignment3.Concrete.GameManager;
import day4Assignment3.Concrete.GamerManager;
import day4Assignment3.Concrete.SaleManager;
import day4Assignment3.Entities.Campaign;
import day4Assignment3.Entities.Game;
import day4Assignment3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		Game game = new Game(1, "Doom 3", "FPS", 200, 2004, "Horror");
		gameManager.add(game);
		
		GamerManager gamerManager = new GamerManager(new FakeMerisService());
		Gamer gamer = new Gamer(1, "Hermione", "Granger", LocalDate.of(1979, 9, 19), "1234");
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Black Friday", null, LocalDate.of(2021, 5, 10), 5);
		campaignManager.add(campaign);
		
		SaleManager sale = new SaleManager();
		sale.sale(gamer, game, campaign);
	}

}
