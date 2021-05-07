package Abstracts;

import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public interface SalesService {
	void sales(Game game, Gamer gamer);
	
	void campaignSales(Game game, Gamer gamer, Campaign campaign);
}
