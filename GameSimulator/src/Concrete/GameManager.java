package Concrete;


import Abstracts.GameService;

import Entites.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi => "+game.getGameName()+" - Fiyat => "+game.getGamePrice()+" TL");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi => "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi => "+game.getGameName()+" - Fiyat => "+game.getGamePrice()+ "TL");
		
	}

}
