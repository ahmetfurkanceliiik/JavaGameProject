import Entites.Gamer;
import Entites.Game;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;

import java.time.LocalDate;
import Entites.Campaign;

public class Main {

	public static void main(String[] args) {
		
		
		//Oyuncu oluþturma
		
		Gamer gamer1=new Gamer(1,"Ahmet Furkan","Çelik",LocalDate.of(1998, 9, 23), "55555555");
		
		Gamer gamer2=new Gamer();
		gamer2.setId(2);
		gamer2.setFirstName("Ali");
		gamer2.setLastName("Gül");
		gamer2.setDateOfBirth(LocalDate.of(1950, 5, 12));
		gamer2.setNationalityId("11111111111");
		/************************************************************/
		
		//Oyun oluþturma
		Game game1=new Game(1,"Call of Duty: Warzone",299);
		
		Game game2=new Game();
		game2.setId(2);
		game2.setGameName("Assassin's Creed Valhalla");
		game2.setGamePrice(249);
		/************************************************************/
		// Kampanya oluþturma
		
		Campaign campaign1=new Campaign(1,"Bahar Ýndirimi",20);
		
		Campaign campaign2=new Campaign();
		campaign2.setId(2);
		campaign2.setCampaignName("Mayýs Ýndirimi");
		campaign2.setDiscount(10);
		/************************************************************/
		
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		SalesManager salesManager=new SalesManager();
		/************************************************************/
		
		//Oyuncu ekleme
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		System.out.println("***********************************");
		/*************************/
		//Oyun ekleme
		 gameManager.add(game1);
		 gameManager.add(game2);
			System.out.println("***********************************");
		 /*************************/
		 //Kampanya ekleme
		 campaignManager.add(campaign1);
		 campaignManager.add(campaign2);
			System.out.println("***********************************");
		 /*************************/
		 //SAtýþ ekleme
		 salesManager.sales(game2, gamer2);
		 salesManager.campaignSales(game1, gamer1, campaign2);
			System.out.println("***********************************");
		 
		 
		 
		 
		 

		
		

	}

}
