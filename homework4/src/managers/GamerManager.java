package managers;

import Utils.Validation;
import models.Gamer;
import services.*;

public class GamerManager implements GamerServices {

	@Override
		public void addGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Adlý Kullanýcý Eklendi");		
	}

	@Override
		public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Adlý Kullanýcý Güncellendi");				
	}

	@Override
		public void deleteGamer(Gamer gamer) {	
		System.out.println(gamer.getFirstName()+" Adlý Kullanýcý Silindi");				
	}

	@Override
	public void logIn(Gamer gamer) {
		if(Validation.validation(gamer)) {
			System.out.println(gamer.getFirstName()+" Adlý Kullanýcý Giriþ Yaptý");
		}else {
			System.out.println(gamer.getFirstName()+" Adlý Kullanýcý Giriþ Baþarasýz ");
		}
		
	}

}
