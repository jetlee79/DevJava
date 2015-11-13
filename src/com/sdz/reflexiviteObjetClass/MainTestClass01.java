package com.sdz.reflexiviteObjetClass;

import java.lang.reflect.Method;

import sun.reflect.generics.scope.MethodScope;

/*
 * Classe de test qui permet de connaître pour la classe 
 *  String les éléments suivant :
 *  -  Connaître la superclasse
 *  -  Connaître la liste des interfaces
 *  -  Connaître la liste des méthodes de la classe
 */
public class MainTestClass01 {

	public static void main(String[] args) {
		//On récupère un objet class
		Class c = new String().getClass();
		//Class c2 = String.class; est équivalent
		
		/* La fammeuse méthode finale dont je vous parlais dans le chapitre
		 * sur l'héritage.
		 * Cette méthode vient de la classe Object.
		 */

		//******************************************
		//Connaître la superclasse d'une classe
		//******************************************
		System.out.println("La superclasse de la classe "
							+ String.class.getName() + " est : "
							+ String.class.getSuperclass());		
		
		// Superclasse null normal car la classe Object ce trouve au sommet de la hiérarchie
		System.out.println("La superclasse de la classe "
				+ Object.class.getName() + " est : "
				+ Object.class.getSuperclass());	
		
		//******************************************
		//Connaître la liste des interfaces d'une classe
		//******************************************
		// La méthode getInterfaces retourne un tableau de Classe
		Class[] faces = c.getInterfaces();
		// Pour voir le nombre d'interfaces
		System.out.println("Il y a " + faces.length + " interfaces implémentées");
		// On parcourt le tableau d'interfaces
		for (int i = 0; i < faces.length; i++) {
			System.out.println( faces[i]);
			
		}
		
		//******************************************
		//Connaître la liste des méthodes de la classe
		//******************************************
		Method[] m = c.getMethods();
		
		System.out.println("Il y a " + m.length + " méthodes dans cette classe");
		// On parcourt le tableau de méthodes
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
			
		}
		
		
	}

}
