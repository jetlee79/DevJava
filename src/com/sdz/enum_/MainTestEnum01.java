package com.sdz.enum_;


public class MainTestEnum01 {

	public static void main(String[] args) {
		
		for (Langage lang : Langage.values()) {
			if (Langage.JAVA.equals(lang)) {
				System.out.println("J'aime le : " + lang);
			} else {
				System.out.println(lang);
			}
		}

	}

}
