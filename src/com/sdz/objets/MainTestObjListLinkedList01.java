package com.sdz.objets;

import java.util.LinkedList;
import java.util.List;

public class MainTestObjListLinkedList01 {

	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(12);		
		l.add("toto ! !");
		l.add(12.20f);
		
		for (int i = 0; i <l.size(); i++) {
			System.out.println("Elément à l'index " + i + " = " + l.get(i));
		}
		
	}

}
