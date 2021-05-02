package Utils;

import models.Gamer;

public class Validation {
	
	public static boolean validation(Gamer gamer) {
		
		if(gamer.getNatioalİdentity().length()>11) {
			return false;
		}
		else if (gamer.getNatioalİdentity().length()<=11 && !gamer.getNatioalİdentity().startsWith("0") ) {
			return true;
			
		}else{
			return false;
			
		}
	}

}
