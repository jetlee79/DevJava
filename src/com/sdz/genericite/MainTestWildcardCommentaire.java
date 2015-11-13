package com.sdz.genericite;

import java.util.ArrayList;
import java.util.List;

public class MainTestWildcardCommentaire {

	public static void main(String[] args) {
		System.out.println("Programme du bouquin en commentaire car les classes Voitures etc... pas créee");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Avec  ? extends MaCLasse\" autorise toutes les collections de classes ayant pour supertype MaCLasse");
		System.out.println("Voir code source commenté");
//		// Liste de voiture
//		List<Voiture> listVoiture = new ArrayList<Voiture>();
//		listVoiture.add(new Voiture());
//		listVoiture.add(new Voiture());
//		
//		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
//		listVoitureSP.add(new VoitureSansPermis());
//		listVoitureSP.add(new VoitureSansPermis());
//		
//		affiche(listVoiture);
//		affiche(listVoitureSP);
//		
//		/* Avec cette méthode, on accepte aussi bien les collections de Voiture 
//		 * que les collection de VoitureSansPermis*/
//		static void affiche(List<? extends Voiture> list){
//			for (Voiture v : list) {
//				System.out.println(v.toString());
//			}
//		}
		
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Avec  ? super MaCLasse\" autorise toutes les collections de classes ayant pour type MaCLasse ettous ses sueprtypes");
		System.out.println("Voir code source commenté");
//		// Liste de voiture
//		List<Voiture> listVoiture = new ArrayList<Voiture>();
//		listVoiture.add(new Voiture());
//		listVoiture.add(new Voiture());
//		
//		List<Object> listVoitureSP = new ArrayList<Object>();
//		listVoitureSP.add(new Object());
//		listVoitureSP.add(new Object());
//		
//		affiche(listVoiture);
//		
//		/* Avec cette méthode, on accepte aussi bien les collections de Voiture 
//		 * que les collection d'Object : superclasse de toutes les classes*/
//		static void affiche(List<? super Voiture> list){
//			for (Object v : list) {
//				System.out.println(v.toString());
//			}
//		}
		
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Exemple 2 et fin du chapitre 18 Avec  ? extends MaCLasse\" autorise toutes les collections de classes ayant pour supertype MaCLasse");
		System.out.println("*************************");
		System.out.println("Description classe Garage");
		System.out.println("*************************");
		System.out.println("Voir code source commenté");
//		import java.util.ArrayList;
//		import java.util.List;
//		public class Garage{
//			List<Voiture> list = new ArrayList<Voiture>();
//			
//			public void add(List<? extends Voiture> listVoiture){
//				for (Voiture v : listVoiture) {
//					list.add(v);
//					
//					System.out.println("Contenu de notre garage :");
//					for (Voiture v : list) {
//						System.out.print(v.toString());
//					}					
//				}
//			}
//			
//		} // Fin classe Garage
		
				
		System.out.println("*************************");
		System.out.println("Le programme Main qui utilise la classe Garage");
		System.out.println("*************************");
		System.out.println("Voir code source commenté");
//		List<Voiture> listVoiture = new ArrayList<Voiture>();
//		listVoiture.add(new Voiture());
//		
//		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
//		listVoitureSP.add(new VoitureSansPermis());
//		
//		Garage garage = new Garage();
//		garage.add(listVoiture);
//		System.out.println("---------------------------------");
//		garage.add(listVoiture);
	}

}
