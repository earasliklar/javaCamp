package services;

import models.Game;

public interface GameServices {

	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
