package models;

public class Game {
	private int gameId;
	private String gameGame;
	private String gameCategory;
	private double price;
	private double priceAfterDicount;
	
	public Game(int gameId, String gameGame, String gameCategory ,double price,Campaign campaign) {
		super();
		this.gameId = 		gameId;
		this.gameGame = 	gameGame;
		this.gameCategory = gameCategory;
		this.price=			price;
		if(!(campaign==null)) {this.setPriceAfterDicount(getPrice()-((getPrice()*campaign.getDiscountrate())/100));}
		
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameGame() {
		return gameGame;
	}
	public void setGameGame(String gameGame) {
		this.gameGame = gameGame;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPriceAfterDicount() {
		return priceAfterDicount;
	}
	public void setPriceAfterDicount( double priceAfterDicount) {
		 this.priceAfterDicount = priceAfterDicount;
		 }

}
