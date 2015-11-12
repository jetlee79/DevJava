package com.sdz.objets;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MainTestObjMapHashtableEtHashMap {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "automne");
		ht.put(45, "hivers");
		
		
		Enumeration e = ht.elements();
		
		while (e.hasMoreElements()) {
			System.out.println( e.nextElement());		
		}
		
		/* Iterator avec une HasMap */
		System.out.println("\n \tParcours HashMap avec un itérateur ");
		System.out.println("-----------------------------------------------------");
		HashMap hm = new HashMap();
		hm.put(1, "printemps");
		hm.put(10, "ÈtÈ");
		hm.put(12, "automne");
		hm.put(45, "hivers");
		hm.put(13, null);
		
		Set<Integer> cles = hm.keySet();
		Iterator<Integer> it = cles.iterator();
		while (it.hasNext()){
		   Object cle = it.next(); // tu peux typer plus finement ici
		   Object valeur = hm.get(cle); // tu peux typer plus finement ici
		   System.out.println("Test guigui for : " + valeur);
		}
		
	}

}
