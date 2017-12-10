package com.voyagesncf.xspeedit.application;

import com.voyagesncf.xspeedit.service.Robot;
import com.voyagesncf.xspeedit.service.impl.RobotActuel;
import com.voyagesncf.xspeedit.service.impl.RobotFitFirst;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;

/**
 * 
 * @author ABG
 *
 */
public class XspeeditApp {

	public static void main(String[] args) {
		UtilsXspeedit vUtilsXspeedit = new UtilsXspeedit();
		String vChaineArticle = "163841689525773";
		if(!vUtilsXspeedit.isValidIntegerSequence(vChaineArticle)) {
			System.out.println("V�rifier la chaine d'entr�e");
		}else {
			Robot vRobotActuel = new RobotActuel();
			String vRpRobotActuelle = (String) vRobotActuel.emballeCarton(vChaineArticle);
			int vNombreCarton = vUtilsXspeedit.getNombreCarton(vRpRobotActuelle);
			
			System.out.println("Articles      : "+vChaineArticle);
			System.out.println("Robot actuel  : "+vRpRobotActuelle+" => "+vNombreCarton+" cartons utilis�s");
			
			Robot vRobotFitFirst = new RobotFitFirst();
			String[] vRpRobotFitFirst = (String[]) vRobotFitFirst.emballeCarton(vChaineArticle);
			System.out.println("Robot optimis�  : "+vUtilsXspeedit.convertArrayIntEnChaine(vRpRobotFitFirst)+" => "+vRpRobotFitFirst.length+" cartons utilis�s");
		}

	}

}
