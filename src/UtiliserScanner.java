import java.util.Scanner;


public class UtiliserScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// --------------------------------
		// Chapitre 3: Lire les entrées clavier
		// --------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		int i = sc.nextInt();
		System.out.println("Veuillez saisir une chaine :");
		// On vide la ligne avant d'en lire une autre
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("FIN ! ");
	}

}
