package com.sdz.genericite;


public class MainTestGenericite01 {

	public static void main(String[] args) {
		
		/* Exemple avant la mise en place de la généricité*/
		
//		Solo val = new Solo(12);
//		int nbre = (Integer)val.getValeur();
		
		/* Exemple avant la mise en place de la généricité class Solo<T> */
		Solo<Integer> val = new Solo<Integer>(12);
		int nbre = val.getValeur();
		
		Solo<Integer> valI = new Solo<Integer>();
		Solo<String> valS = new Solo<String>("totototo");
		Solo<Float> valF = new Solo<Float>(12.2f);
		Solo<Double> valD = new Solo<Double>(12.202568);


	}

}
