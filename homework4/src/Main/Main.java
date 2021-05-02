package Main;

import managers.CampaignManager;
import managers.GameManager;
import managers.GamerManager;
import managers.SaleManager;
import models.Campaign;
import models.Game;
import models.Gamer;

public class Main {

	public static void main(String[] args) {
		Campaign campaign		  	 = new Campaign(1,"Yýlbaþý Ýndirimi",10);
		GameManager gameManager 	 = new GameManager();
		GamerManager gamerManager	 = new GamerManager(); 
	System.out.println("-----------------------------------Oyuncular------------------------------------------------------");	
		Gamer gamer1 = new Gamer(1, "Emre", "Araþlýklar", "38256324511", "12,11,2012");
		Gamer gamer2 = new Gamer(2,"Tolga","Ok","06486521547","12,14,2017");
		
		Gamer[] gamers = {gamer1,gamer2};
		for(Gamer gamer:gamers) {
				System.out.println("-----------------------------Kullanýcý "+gamer.getGamerId()+"---------------------------------------------------");
				System.out.println("Kullanýcý Adý: "		+gamer.getFirstName());
				System.out.println("Kullanýcý Soyadý: "		+gamer.getLastName());
				System.out.println("Kullanýcý TC: "			+gamer.getNatioalÝdentity());
				System.out.println("Kullanýcý DoðumTarihi: "+gamer.getBirthDate());
				
		}
	System.out.println("------------------------------------Oyunlar-----------------------------------------------------");	
		Game game1 = new Game(1, "Mario", "Arcade",150, campaign);
		Game game2 = new Game(2, "Jazz Jack Rabbit", "Arcade",200, null);
		
		Game[] games = {game1,game2};
		for(Game game:games) {
			System.out.println("------------------------------------Oyun"+game.getGameId()+"-----------------------------------------------------");	
				System.out.println("Oyun Adý : "	+game.getGameGame());
				System.out.println("Oyun Türü : "	+game.getGameCategory());
				
				if(!(game.getPriceAfterDicount()==0)){
					System.out.println("Oyun Fiyatý : "	+game.getPrice());
					System.out.println("Oyunun Kampanyalý Fiyatý : "	+game.getPriceAfterDicount());
				} 
				else{
					System.out.println("Oyun Fiyatý : "	+game.getPrice());
				}
				
		}
		
		System.out.println("------------------------------------Kampanyalar-----------------------------------------------------");	
		
	
		System.out.println("Kampanyanýn Adý : "+campaign.getCampaignName());
		System.out.println("Kampanyanýn Adý : "+campaign.getDiscountrate());
		
		System.out.println("------------------------------------Oyun Ýþlemleri-----------------------------------------------------");	
				gameManager.addGame(game1);
				gameManager.deleteGame(game1);
				gameManager.updateGame(game1);
		System.out.println("------------------------------------Oyuncu Ýþlemleri-----------------------------------------------------");	
				gamerManager.addGamer(gamer2);
				gamerManager.deleteGamer(gamer2);
				gamerManager.updateGamer(gamer2);
				gamerManager.logIn(gamer2);
				gamerManager.logIn(gamer1);
		System.out.println("------------------------------------Kampanya Ýþlemleri-----------------------------------------------------");	
				CampaignManager campaignManager = new CampaignManager();
				campaignManager.addCampaign(campaign);
				campaignManager.deleteCampaign(campaign);
				campaignManager.updateCampaign(campaign);
		System.out.println("------------------------------------Satýþ Ýþlemleri-----------------------------------------------------");	
				SaleManager saleManager = new SaleManager();
				saleManager.buy(game1, gamer1);
				saleManager.buy(game2, gamer2);
	
	
	}

}
