package managers;

import models.Campaign;
import services.*;
 
public class CampaignManager implements CampaignServices  {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� Kampanya Eklendi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� Kampanya G�ncellendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adl� Kampanya Silidni");
		
	}

}
