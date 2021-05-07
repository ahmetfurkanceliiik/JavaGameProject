package Concrete;

import Abstracts.CampaignService;
import Entites.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi -> Kampanya ad� => " + campaign.getCampaignName() + "  / �ndirim oran� => %" + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getCampaignName() );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi -> Kampanya ad� => " + campaign.getCampaignName() + " / �ndirim oran� => %" + campaign.getDiscount());
		
	}

}
