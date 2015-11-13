package com.sdz.genericite;

public class Duo<T, S> {
	// Variable d'instance de type T
	private T valeur1;
	
	// Variable d'instance de type S
	private S valeur2;
	
	// Constructeur par défaut
	public Duo(){
		this.valeur1 = null;
		this.valeur2 = null;
	}
	// Constructeur avec paramètre
	public Duo(T val1, S val2){
		this.valeur1 = val1;
		this.valeur2 = val2;
	}
	
	// Méthode d'initialisation des deux valeurs
	public void  setValeur(T val1, S val2){
		this.valeur1 = val1;
		this.valeur2 = val2;
	}
	
	/**
	 * @return la valeur1
	 */
	public T getValeur1() {
	
		return valeur1;
	}
	
	/**
	 * @param Défini la valeur T
	 */
	public void setValeur1(T valeur1) {
		this.valeur1 = valeur1;
	}
	
	/**
	 * @return la valeur2
	 */
	public S getValeur2() {
		return valeur2;
	}
	
	/**
	 * @param Défini la valeur S
	 */
	public void setValeur2(S valeur2) {
		this.valeur2 = valeur2;
	}
	
	
	
}
