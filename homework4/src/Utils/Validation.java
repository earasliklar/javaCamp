package Utils;

import models.Gamer;

public class Validation {
	
	public static boolean validation(Gamer gamer) {
		
		if(gamer.getNatioal�dentity().length()>11) {
			return false;
		}
		else if (gamer.getNatioal�dentity().length()<=11 && !gamer.getNatioal�dentity().startsWith("0") ) {
			return true;
			
		}else{
			return false;
			
		}
	}

}
