package managers;

import models.Campaign;
import services.*;
 
public class CampaignManager implements CampaignServices  {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý Kampanya Eklendi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý Kampanya Güncellendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý Kampanya Silidni");
		
	}

}
