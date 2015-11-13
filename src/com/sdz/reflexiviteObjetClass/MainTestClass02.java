package com.sdz.reflexiviteObjetClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Classe de test qui permet de conna�tre pour la classe 
 *  String la liste de ses :
 *  -  m�thodes de la classe ainsi que celle de leurs arguments respectifs
 *  -  des champs d'une classe (Variable de classe ou d'insatance)
 *  -  des constructeurs d'une classe 
 */
public class MainTestClass02 {

	public static void main(String[] args) {
		
		Class c = new String().getClass();
		Method[] m = c.getMethods();
		
		//******************************************
		// Conna�tre la liste des m�thodes de la classe
		// ainsi que celle de leurs arguments respectifs
		//******************************************		
		System.out.println("Il y a " + m.length + " m�thodes dans cette classe");
		// On parcourt le tableau de m�thodes
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
			
			Class[] p = m[i].getParameterTypes();
			for (int j = 0; j < p.length; j++) {
				System.out.println(p[j]);				
			}
			
			System.out.println("------------------------------------------------------------------");
		}
		
		//******************************************
		//Conna�tre la liste des champs d'une classe (Variable de classe ou d'insatance)
		//******************************************
		Field[] mc = c.getDeclaredFields();
		System.out.println("Il y a " + mc.length + " champs dans cette classe");
		// On parcourt le tableau de m�thodes
		for (int i = 0; i < mc.length; i++) {
			System.out.println(mc[i].getName());
		}
		
		
		//******************************************
		//Conna�tre la liste des constructeurs d'une classe 
		//******************************************
		Constructor[] construc = c.getConstructors();
		System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
		// On parcourt le tableau de m�thodes
		for (int i = 0; i < construc.length; i++) {
			System.out.println(construc[i].getName());
			
			Class[] param = construc[i].getParameterTypes();
			for (int j = 0; j < param.length; j++) {
				System.out.println(param[j]);				
			}
			
			System.out.println("------------------------------------------------------------------");
		}
		
		
		
	}

}
