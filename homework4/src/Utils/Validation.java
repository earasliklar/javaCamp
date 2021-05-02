package Utils;

import models.Gamer;

public class Validation {
	
	public static boolean validation(Gamer gamer) {
		
		if(gamer.getNatioalĘdentity().length()>11) {
			return false;
		}
		else if (gamer.getNatioalĘdentity().length()<=11 && !gamer.getNatioalĘdentity().startsWith("0") ) {
			return true;
			
		}else{
			return false;
			
		}
	}

}
