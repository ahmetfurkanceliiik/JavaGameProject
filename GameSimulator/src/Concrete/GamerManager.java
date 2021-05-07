package Concrete;

import Abstracts.GamerService;
import Abstracts.UserValidationService;
import Entites.Gamer;

public class GamerManager  implements GamerService{
	
	private UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService=userValidationService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(userValidationService.CheckIFRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi => "+gamer.getFirstName()+" "+gamer.getLastName());
			
		}else {
			System.out.println("Oyuncu eklenemedi => "+gamer.getFirstName()+" "+gamer.getLastName()+ " Mernis doðrulamasý uyuþmuyor!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi => "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		if(userValidationService.CheckIFRealPerson(gamer)) {
			System.out.println("Oyuncu Güncellendi  => " + gamer.getFirstName() + " " + gamer.getLastName());
		}
		else {
			System.out.println("Oyuncu Güncellenemedi => " + gamer.getFirstName() + " " + gamer.getLastName() + "  Mernis doðrulamasý uyuþmuyor!");
		}
		
	}

}
