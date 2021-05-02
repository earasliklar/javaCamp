package services;

import models.Gamer;

public interface GamerServices {
	
	void logIn(Gamer gamer);
	void addGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	

}
