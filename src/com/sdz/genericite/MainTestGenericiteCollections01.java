package com.sdz.genericite;

import java.util.ArrayList;
import java.util.List;

public class MainTestGenericiteCollections01 {

	public static void main(String[] args) {
		System.out.println("Liste de String");
		System.out.println("------------------------------");
		List<String> listeString = new ArrayList<String>();
		listeString.add("Une chaîne");
		listeString.add("Une autre");
		listeString.add("Encore une autre");
		listeString.add("Allez, une dernière");
		
		for (String str : listeString) {
			System.out.println(str);
		}
		
		System.out.println("\nListe de float");
		System.out.println("------------------------------");
		
		List<Float> listeFloat = new ArrayList<Float>();
		//ArrayList<Float> listeFloat = new ArrayList<Float>();  //---> Demander à juju pkoi on fait pas Arraylist
		// --> Réponse juju on travail avec l'iterface List c'est le plus haut niveau 
		listeFloat.add(12.25f);
		listeFloat.add(15.25f);
		listeFloat.add(2.25f);
		listeFloat.add(128765.25f);
		
		for (Float f : listeFloat) {
			System.out.println(f);
		}
		
	}

}
