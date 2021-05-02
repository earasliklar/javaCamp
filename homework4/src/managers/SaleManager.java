package managers;

import models.Game;
import models.Gamer;
import services.SaleServices;

public class SaleManager implements SaleServices {

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(game.getGameGame()+" Adl� Oyun "+gamer.getFirstName()+
				" Adl� Kullan�c� Taraf�ndan Sat�n Al�nd�");
		
		if(game.getPriceAfterDicount()==0) {
					System.out.println("Fiyat� "+game.getPrice());
				}else {
					System.out.println("Fiyat� "+game.getPriceAfterDicount());
				}
		

	}

	
	

}
