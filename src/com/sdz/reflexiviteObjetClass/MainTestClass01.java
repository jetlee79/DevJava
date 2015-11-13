package com.sdz.reflexiviteObjetClass;

import java.lang.reflect.Method;

import sun.reflect.generics.scope.MethodScope;

/*
 * Classe de test qui permet de conna�tre pour la classe 
 *  String les �l�ments suivant :
 *  -  Conna�tre la superclasse
 *  -  Conna�tre la liste des interfaces
 *  -  Conna�tre la liste des m�thodes de la classe
 */
public class MainTestClass01 {

	public static void main(String[] args) {
		//On r�cup�re un objet class
		Class c = new String().getClass();
		//Class c2 = String.class; est �quivalent
		
		/* La fammeuse m�thode finale dont je vous parlais dans le chapitre
		 * sur l'h�ritage.
		 * Cette m�thode vient de la classe Object.
		 */

		//******************************************
		//Conna�tre la superclasse d'une classe
		//******************************************
		System.out.println("La superclasse de la classe "
							+ String.class.getName() + " est : "
							+ String.class.getSuperclass());		
		
		// Superclasse null normal car la classe Object ce trouve au sommet de la hi�rarchie
		System.out.println("La superclasse de la classe "
				+ Object.class.getName() + " est : "
				+ Object.class.getSuperclass());	
		
		//******************************************
		//Conna�tre la liste des interfaces d'une classe
		//******************************************
		// La m�thode getInterfaces retourne un tableau de Classe
		Class[] faces = c.getInterfaces();
		// Pour voir le nombre d'interfaces
		System.out.println("Il y a " + faces.length + " interfaces impl�ment�es");
		// On parcourt le tableau d'interfaces
		for (int i = 0; i < faces.length; i++) {
			System.out.println( faces[i]);
			
		}
		
		//******************************************
		//Conna�tre la liste des m�thodes de la classe
		//******************************************
		Method[] m = c.getMethods();
		
		System.out.println("Il y a " + m.length + " m�thodes dans cette classe");
		// On parcourt le tableau de m�thodes
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
			
		}
		
		
	}

}
