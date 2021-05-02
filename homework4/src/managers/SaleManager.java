package managers;

import models.Game;
import models.Gamer;
import services.SaleServices;

public class SaleManager implements SaleServices {

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(game.getGameGame()+" Adlý Oyun "+gamer.getFirstName()+
				" Adlý Kullanýcý Tarafýndan Satýn Alýndý");
		
		if(game.getPriceAfterDicount()==0) {
					System.out.println("Fiyatý "+game.getPrice());
				}else {
					System.out.println("Fiyatý "+game.getPriceAfterDicount());
				}
		

	}

	
	

}
