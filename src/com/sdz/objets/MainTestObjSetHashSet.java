package com.sdz.objets;

import java.util.HashSet;
import java.util.Iterator;

public class MainTestObjSetHashSet {

	public static void main(String[] args) {
		//HashSet<E> hs = new HashSet<E>();
		HashSet hs = new HashSet();
		hs.add("toto");
		hs.add(12);
		hs.add('d');

		
		//Iterator<E> it = hs.iterator();
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println( it.next());			
		}
		
		System.out.println("\n \tParcours avec un tableau d'objet ");
		System.out.println("-----------------------------------------------------");
		
		Object[] obj = hs.toArray();
		for (Object o : obj) {
			System.out.println(o);
		}
		
	}

}
