public class MethodesDeClasse {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // -----------------------------
        // Des méthodes concernant les chaînes de caractères
        // -----------------------------

        String chaine = new String("COUCOU TOUT LE MONDE !");
        String chaine2 = new String();
        String chaine3 = new String("coucou coucou");
        // toLowerCase
        chaine2 = chaine.toLowerCase();// "Donne coucou tout le monde !"
        System.out.println(chaine2);

        // toUpperCase
        System.out.println(chaine3.toUpperCase()); // Donne "COUCOU COUCOU"
        // lenght
        String chaine4 = new String("coucou ! ");
        System.out.println(chaine4.length()); // Renvoie 9

        // equals
        String str1 = new String("coucou");
        String str2 = new String("toutou");
        if (str1.equals(str2)) {
            System.out.println(" Les deux chaînes sont identiques !");
        } else {
            System.out.println(" Les deux chaînes sont différentes !");
        }

        // charAt
        String nbre = new String("1234567");
        System.out.println(nbre.charAt(4)); // Renverra 5

        // substring
        String chaine5 = new String("la paix niche");
        String chaine6 = new String();
        chaine6 = chaine5.substring(3, 13);
        System.out.println(chaine6); // Permet d'extraire pax niche

        // indexOf
        // lastIndexOf
        String mot = new String("anticonstitutionnellement");
        int n = 0;
        System.out.println(mot.indexOf('t')); // Renvoi 2
        System.out.println(mot.lastIndexOf('t')); // Renvoi 24
        System.out.println(mot.indexOf("ti")); // Renvoi 2
        System.out.println(mot.lastIndexOf("ti")); // Renvoi 12
        System.out.println(mot.indexOf('x')); // Renvoi 2

        // -----------------------------
        // Des méthodes concernant les mathématiques
        // -----------------------------
        double X = 0.0;
        // random
        X = Math.random(); // Retourne un nombre aléatoire entre 0 et 1.
        System.out.println(X);

        double sin = Math.sin(120); // La fonction sinus
        System.out.println("Le sinus de 120 est " + sin);
        double cos = Math.sin(120); // La fonction cosinus
        System.out.println("Le cosinus de 120 est " + cos);
        double tan = Math.tan(120); // La fonction tangente
        System.out.println("Le tangente de 120 est " + tan);
        double abs = Math.abs(-120.25); // La fonction valeur absolue (retourne
        // le nombre sans le signe)
        System.out.println("La valeur absolue de - 120.25 est " + abs);

        double d = 2;
        double exp = Math.pow(d, 2); // La fonction exposant
        System.out.println("d au carré sachant que d = " + d + " alors le résultat est : " + exp);
        // Déclaration tableau
        String[] tab = {"toto", "tata", "titi", "tete"};
        String[] tab2 = {"guillaume", "marie", "paul", "madeleine"};
        int[] tabInt = {1, 2, 3, 4};
        String tabMulti2[][] = {{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};

        // La méthode avec un tableau de String sera invoquée
        System.out.println();
        System.out.println("Contenu du tableau tab");
        parcourirTableau(tab);
        System.out.println();

        // La méthode avec un tableau de String sera invoquée
        System.out.println("Contenu du tableau tab2");
        parcourirTableau(tab2);
        System.out.println();

        // La méthode toString sera invoquée avec un tableau de String
        System.out.println("Appel toString avec le tableau tab2");
        System.out.println(toString(tab2));
        System.out.println();

        // La méthode avec un tableau d'int sera invoquée
        System.out.println("Contenu du tableau tabInt");
        parcourirTableau(tabInt);
        System.out.println();

        // La méthode avec un tableau de string à 2 dimensions sera invoquée
        System.out.println("Contenu du tableau tabMulti2");
        parcourirTableau(tabMulti2);

    }

    /**
     * Arrondi le chiffre A avec B chiffres derrière a virgule
     *
     * @param A
     *            A le nombre à arrondir
     * @param B
     *            B défini le nombre de chiffres derrière la virgule
     * @return double
     */
    public static double arrondi(double A, int B) {
        return ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    static void parcourirTableau(String[] tabBis) {
        for (String str : tabBis) {
            System.out.println(str);
        }
    }

    static void parcourirTableau(int[] tabBis) {
        for (int str : tabBis) {
            System.out.println(str);
        }
    }

    static void parcourirTableau(String[][] tab) {
        for (String tab2[] : tab) {
            for (String str : tab2) {
                System.out.println(str);
            }
        }
    }

    static String toString(String[] tab) {
        System.out.println("Méthode toString() ! \n--------");
        String retour = "";
        for (String str : tab) {
            retour += str + "\n";
        }
        return retour;
    }

}
