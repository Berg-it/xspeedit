package com.voyagesncf.xspeedit.utils;

public class UtilsXspeedit {

	
	/**
	 * V�rifier si la chanine d'entr�e que contien que des valeurs num�rique
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
