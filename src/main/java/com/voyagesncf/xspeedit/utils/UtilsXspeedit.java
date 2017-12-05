package com.voyagesncf.xspeedit.utils;

public class UtilsXspeedit {

	
	/**
	 * Vérifier si la chanine d'entrée que contien que des valeurs numérique
	 * @param string
	 * @return
	 */
	public Boolean isValidIntegerSequence(String string) {
		if(string!= null && !string.isEmpty())
		{
			for(char vItem: string.toCharArray() ) {
				if(! Character.isDigit(vItem)) {
					return false;
				}
			}
		}else {
			return false;
		}
		
		return true;
	}

}
