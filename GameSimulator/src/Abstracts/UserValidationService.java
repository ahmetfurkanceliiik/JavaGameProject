package Abstracts;

import Entites.Gamer;

public interface UserValidationService {
	 default boolean CheckIFRealPerson(Gamer gamer) {
		return true;
	}
}
