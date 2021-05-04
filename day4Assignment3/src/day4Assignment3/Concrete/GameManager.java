package day4Assignment3.Concrete;

import day4Assignment3.Abstract.GameService;
import day4Assignment3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " has been added.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " has been deleted.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " has been updated.");
	}
}
