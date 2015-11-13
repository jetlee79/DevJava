package com.sdz.genericite;

public class MainTestGenericite02 {

	public static void main(String[] args) {
		Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", true);
		System.out.println("Valeur de l'objet dual : val 1 = " + 
								dual.getValeur1() + ", val2 = " +
								dual.getValeur2());
	
		Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		System.out.println("Valeur de l'objet dual2 : val 1 = " + 
				dual2.getValeur1() + ", val2 = " +
				dual2.getValeur2());
	}

}
