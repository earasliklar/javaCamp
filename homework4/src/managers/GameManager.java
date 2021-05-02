package managers;

import models.Game;
import services.GameServices;

public class GameManager implements GameServices {

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameGame()+" Adlý Oyun Eklendi ");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameGame()+" Adlý Oyun Silindi ");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameGame()+" Adlý Oyun Güncellendi ");
		
	}
	

}
