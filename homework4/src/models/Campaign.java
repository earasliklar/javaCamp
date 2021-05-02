package models;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private double discountrate;
		

	public Campaign(int campaignId, String campaignName, double discountrate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountrate = discountrate;
	}


	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}

}
