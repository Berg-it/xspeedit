package com.voyagesncf.xspeedit.service.impl;

import com.voyagesncf.xspeedit.service.Robot;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;

/**
 * 
 * @author ABG
 * next fit algorithme
 */
public class RobotActuel implements Robot {

	
	UtilsXspeedit vUtilsXspeedit = new UtilsXspeedit();
	
	/**
	 * Elle va emballer les articles dans les cartons
	 * @return
	 */
	public String emballeCarton(String chaineArticle) {
		
		final StringBuilder vReponse = new StringBuilder();
		
		int[] vChaineArticleInt = vUtilsXspeedit.conertirChainEnIntegerArray(chaineArticle);
		
        int vCartonCapacite = 10;
        for(int vTailleArticle : vChaineArticleInt) {
        	//Vérifier si on peut l'ajouter dans le carton
            if(vCartonCapacite - vTailleArticle < 0) {
                vReponse.append("/");
                vCartonCapacite = 10;
            }
            //Ajouter dans le carton
            vReponse.append(vTailleArticle);
            //Capacité restons dans le carton
            vCartonCapacite -= vTailleArticle;
        }
        
        return vReponse.toString();
        
	}
	
		
	
}
