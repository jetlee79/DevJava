package com.sdz.objets;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class MainTestObjMapHashMap {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "automne");
		ht.put(45, "hivers");
		
//		for (int i = 0; i < ht.size(); i++) {
//			System.out.println("guigui avec elements : " + ht.elements().toString());
//			System.out.println("guigui avec get : " + ht.get(i));
//		}
		
		Enumeration e = ht.elements();
		
		while (e.hasMoreElements()) {
			System.out.println( e.nextElement());		
		}

		HashMap hm = new HashMap();
		hm.put(1, "printemps");
		hm.put(10, "été");
		hm.put(12, "automne");
		hm.put(45, "hivers");
		//hm.put(13, null);
		
//		Enumeration e2 = hm.elements();
//		
//		while (e2.hasMoreElements()) {
//			System.out.println( e2.nextElement());		
//		}
		
//		for (int j = 0; j <hm.size(); j++) {
//			System.out.println("Test guigui for : " + hm.get(j));
//		}
		
	}

}
