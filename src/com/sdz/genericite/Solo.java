package com.sdz.genericite;

public class Solo<T> {

	// Variable d'instance
	private T valeur;
	
	// Constructeur par défaut
	public Solo(){
		
	}
	// Constructeur avec paramètre inconnu pour l'instant
	public Solo(T val){
		this.valeur = val;
	}

	/**
	 * Retourne la valeur déjà "casté" par la signature de la méthode !
	 */
	public T getValeur() {
		return this.valeur;
	}

	/**
	 * Définit la valeur avec le paramètre
	 */
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	
	
	
}
