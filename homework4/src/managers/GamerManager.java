package managers;

import Utils.Validation;
import models.Gamer;
import services.*;

public class GamerManager implements GamerServices {

	@Override
		public void addGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Adl� Kullan�c� Eklendi");		
	}

	@Override
		public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Adl� Kullan�c� G�ncellendi");				
	}

	@Override
		public void deleteGamer(Gamer gamer) {	
		System.out.println(gamer.getFirstName()+" Adl� Kullan�c� Silindi");				
	}

	@Override
	public void logIn(Gamer gamer) {
		if(Validation.validation(gamer)) {
			System.out.println(gamer.getFirstName()+" Adl� Kullan�c� Giri� Yapt�");
		}else {
			System.out.println(gamer.getFirstName()+" Adl� Kullan�c� Giri� Ba�aras�z ");
		}
		
	}

}
