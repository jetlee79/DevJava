import java.util.Scanner;

public class ManipulationTableau {

    public static void main(String[] args) {
        // Notre tableau
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        // Notre objet Scanner
        Scanner sc = new Scanner(System.in);
        // Autres variables
        int i = 0, emplacement = 0;
        char reponse = ' ', carac = ' ';

        // -----------------------------
        // Tableau à une dimension
        // -----------------------------
        do {// boucle principale

            do {// tant que reponse n'est pas O ou N
                i = 0;
                System.out.println("Rentrez une lettre en minuscule SVP : ");

                carac = sc.nextLine().charAt(0);
                // Boucle recherche dans tableau
                while (i < tableauCaractere.length && carac != tableauCaractere[i]) {
                    i++;
                }

                // Si i < 7 c'est que la boucle n'a pa s passé le nombre de
                // cases du tableau
                if (i < 7) {
                    System.out.println(" La lettre " + carac + " se trouve bien dans le tableau !");
                } else {
                    System.out.println(" La lettre " + carac + " ne se trouve pas dans le tableau !");
                }

            } while (i >= tableauCaractere.length);

            // Tant que la lettre de l'utilisateur
            // ne correspond pas à une lettre du tableau
            do {
                System.out.println("Voulez-vous essayer à nouveau ?(O/N)");
                reponse = sc.nextLine().charAt(0);

            } while (reponse != 'O' && reponse != 'N');

        } while (reponse == 'O');

        System.out.println("Au revoir !");

        // Génère une erreur java.lang.ArrayIndexOutOfBoundsException
        // String[] str = new String[10];
        // str[10] = "Une exception";

        // -----------------------------
        // Tableau multidimensionnels (bidimensionnels ici)
        // -----------------------------
        // ******************
        // Avec le While
        // ******************
        int premiersNombres[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}}, j = 0;
        i = 0;

        while (i < 2) {
            j = 0;
            while (j < 5) {
                System.out.print(premiersNombres[i][j]);
                j++;
            }
            System.out.println("");
            i++;
        }

        // ******************
        // Avec le For
        // ******************;
        for (int i2 = 0; i2 < 2; i2++) {
            for (int j2 = 0; j2 < 5; j2++) {
                System.out.print(premiersNombres[i2][j2]);
            }
            System.out.println("");
        }
        // ******************
        // Avec UNE AUTRE SYNTAXE du For
        // ******************
        // Exemple 1

        String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
        for (String str : tab) {
            System.out.println(str);
        }

        // Exemple 2

        String tab2[][] = {{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
        i = 0;
        j = 0;

        for (String sousTab[] : tab2) {

            // i = 0;
            for (String str : sousTab) {
                System.out.println("La valeur de la nouvelle boucle est : " + str);
                // System.out.println("La valeur du tableau à l'indice [" + j +
                // "] [" + i + "] est : " + tab2[j][i]);
                // i++;
            }
            // j++;
        }

    }

}
