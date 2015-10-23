import java.util.Scanner;


public class Tp1ConvCelsiusFareiheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char conversion = 'O';
		Scanner sc = new Scanner(System.in);
		int choixConversion;
		double temperature;
		double resultat;
		
		while (conversion ==  'O') {
			//Demande type de conversion
			choixConversion = 0;
			while (choixConversion != 1 && choixConversion != 2) {
				System.out.println("Choisissez le mode de conversion :");
				System.out.println("1 - Convertisseur Celsius - Farenheit :");
				System.out.println("2 - Convertisseur Farenheit - Celsius :");
				choixConversion = sc.nextInt();
				sc.nextLine();
			}

			
			System.out.println("Température à convertir :");
			temperature = sc.nextDouble();
			sc.nextLine();
			
			if (choixConversion == 1) {
				//Conversion Celsius - Farenheit
				resultat =  ((9/5)*temperature) + 32;
				System.out.println(temperature + " °C correspond à : " + resultat + " °F.");
			} else {
				//Conversion Farenheit - Celsius
				resultat = ((temperature -32)*5)/9;
				resultat = arrondi(resultat, 2);
				System.out.println(temperature + " °F correspond à : " + resultat + " °C.");
			}		
					
			conversion = ' ';
			while (conversion != 'O' && conversion != 'N') {
				System.out.println("Souhaitez-vous convertire une autre température ?(O/N) :");
				conversion = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Au revoir !");

	}
	
	public static double arrondi(double A, int B){
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}
