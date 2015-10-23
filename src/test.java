import java.util.Scanner;

/**
 * 
 */

/**
 * @author Guillaume
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// --------------------------------
		// Chapitre 1: Installer les outils de développement
		// --------------------------------
		System.out.print("Hello World\n");
		System.out.println("Thanks Juju");		
		System.out.println("My name is");
		System.out.println("\nGuillaume");
		System.out.println("Coucou mon \"chou\"!");
		System.out.println("Fin");
		
		// --------------------------------
		// Chapitre 2: Les variables et les opérateurs
		// --------------------------------
		double nbre1 = 10, nbre2 = 3;
		int resultat = (int) (nbre1 / nbre2);
		System.out.println("Le résultat est = " + resultat);
		
		int i = 12;
		String j = new String();
		j = j.valueOf(i);
		int k = Integer.valueOf(j).intValue();
		System.out.println("La valeur de \"j\" est = " + j + " et la valeur de k est " + k);
		
		// --------------------------------
		// Chapitre 4: La structure if else
		// --------------------------------
		int i2 =0;
		if (i2 < 0) {
			System.out.println("le nombre est négatif");
		} else if(i2 >0){
			System.out.println("le nombre est négatif");
		} else{
			System.out.println("le nombre est null");
		}
		
		//Conditions multiples
		int i3 =100;
		if (i3 < 100 || i3> 100) {
			System.out.println("Le nombre est dans l'intervalle.");
		} else {
			System.out.println("Le nombre n'est pas dans l'intervalle.");
		}
		
		// Structure switch
		int note = 10; // On imagine que la note maximale est 20
		switch (note) {
		case 0:
			System.out.println("Ouch !");
			break;
		case 10:
			System.out.println("Vous avez juste la moyenne.");
			break;
		case 20:
			System.out.println("Parfait !");
			break;
		default:
			System.out.println("il faut davantage travailler.");
			break;
		}
		
		// La condition ternaire
		int x = 10, y = 20;
		int max = (x < y) ? y : x; // Maintenant max vaut 20
		
		int max2 = (x < y) ? y * 2 :  x * 2; // Ici max2 vaut 2 * 20 donc 40
		
		int max3 = (x < y) ? ((y < 10 ) ? y % 10 : y * 2) : x; // Ici max3 vaut  40
		
		// --------------------------------
		// Chapitre 5: Les boucles
		// --------------------------------
		//******************
		// Le While
		//******************
		//Une variable vide
		String prenom;
		//On initialise celle-ci à 0 pour oui
		char reponse = 'O';		
		// Notre objet Scanner, n'oubliez pas l'import de java.util.Scanne r!
		Scanner sc = new Scanner(System.in);
		// Tant que la réponde données est égalé ) oui ...
		while (reponse == 'O') {
			
			// On affiche un einstruction
			System.out.println("Donnez un prénom : ");
			// On récupère le prénom saisi
			prenom = sc.nextLine();
			// On affiche notre phrase avec le prémom
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			// Sans ça, nous n'entrerions pas dans la deuxième boucle
			reponse = ' ';
			
			// Tant que la réponse n'est pas O ou N on repose la question
			while (reponse != 'O' && reponse != 'N') {
					// On demande si la personne veux faire un autre essai
					System.out.println("Voulez-vous réessayez ? (O/N)");
					// On récupère la réponse de l'utilisateur
					reponse = sc.nextLine().charAt(0);	
			}
		}
		System.out.println("Au revoir...");
		// Fin boucle		
		
		int a =1, b = 15;
		while (++a < 15) {
			System.out.println("Coucou " +a+ " fois !!");
			//a++;			
		}
		
		//******************
		// Le Do ... While
		//******************
		//String prenom2 = new String();
		// Pas besoin d'initialiser: on rentre au moins une fois dans la boucle
		reponse = ' ';
		
		do {
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			
			do {
				System.out.println("Voulez-vous réessayez ? (O/N)");
				// On récupère la réponse de l'utilisateur
				reponse = sc.nextLine().charAt(0);	
			} while (reponse != 'O' && reponse != 'N' );
		} while (reponse == 'O') ;
		System.out.println("Au revoir...");
		
		//******************
		// Le FOR
		//******************
		for (int l = 1; l <= 10; l++) {
			System.out.println("Voici la ligne "+l);			
		}
		// Avec décrémentation
		for (int l = 10; l >= 0; l--) {
			System.out.println("Il reste "+l+" ligne(s) à écrire");			
		}
	}

}
