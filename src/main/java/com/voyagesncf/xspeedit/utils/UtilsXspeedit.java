package com.voyagesncf.xspeedit.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

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
	
	/**
	 * Convertir la chaine d'article en un array d'int
	 * @param chaineArticleEmballerRobotActuel
	 * @return
	 */
	public int[] conertirChainEnIntegerArray(String chaineArticleEmballerRobotActuel) {

		int[] vResopnse = null;
		int vIndex=0;
		vResopnse = new int[chaineArticleEmballerRobotActuel.length()];

		for(char vItem:chaineArticleEmballerRobotActuel.toCharArray()) {
			vResopnse[vIndex] = vItem-'0'; 
			vIndex++;
		}
		return vResopnse;
	}
	
	/**
	 * Retounr le nombre de carton utilis�
	 * @param chaineArticleEmballerRobotActuel
	 * @return
	 */
	public int getNombreCarton(String chaineArticleEmballerRobotActuel) {

		String[] seperated = chaineArticleEmballerRobotActuel.split("\\/");
		
		return seperated.length;
	}

	/**
	 * Convertir un array de String en une chaine de caract�re sp�ar�e par des "/"
	 * @param arrayInt
	 * @return
	 */
	public String convertArrayIntEnChaine(String[] arrayInt) {

		return Arrays.stream(arrayInt).collect(Collectors.joining("/"));
	}

}
