package com.sdz.objets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTestObjListLinkedList01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une cha�ne de caract�res !");
		al.add(12.20f);
		al.add('d');
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Donn�e � l'indice " + i + " = " + al.get(i));
		}
	}

}
