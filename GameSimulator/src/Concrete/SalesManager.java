package Concrete;

import Abstracts.SalesService;
import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sales(Game game, Gamer gamer) {
		System.out.println("Oyun satýþý: "+gamer.getFirstName()+" "+gamer.getLastName()+"- "+game.getGameName()+" oyununu "+game.getGamePrice()+" Tl'ye satýn aldý.");
		
	}

	@Override
	public void campaignSales(Game game, Gamer gamer, Campaign campaign) {
		double hesap=game.getGamePrice()-(game.getGamePrice()*campaign.getDiscount()/100);
		System.out.println("Oyun Satýþý : " + gamer.getFirstName() + " " + gamer.getLastName() + ", " + game.getGameName() + " oyununu " + campaign.getCampaignName() + " kampanyasý ile %" + campaign.getDiscount() + " indirimle " + hesap + " TL'ye satýn aldý.");
		
	}

}
