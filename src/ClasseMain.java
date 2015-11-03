public class ClasseMain {

    public static void main(String[] args) {
        // Vos données, variables, différents traitements ...

        Ville v = new Ville();
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.getNbreInstancesBis());

        Ville v1 = new Ville("Marseille", 123456, "France");
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.getNbreInstancesBis());

        Ville v2 = new Ville("Rio", 321654, "Brésil");
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est : " + Ville.getNbreInstancesBis());

        System.out.println("\n\n" + v1.decrisToi());
        System.out.println(v.decrisToi());
        System.out.println(v2.decrisToi() + "\n\n");
        System.out.println(v1.comparer(v2));

        Capitale cap = new Capitale();
        System.out.println(cap.decrisToi());

        Capitale cap2 = new Capitale("Paris", 654987, "France", "la tour Eiffel");
        System.out.println("\n" + cap2.decrisToi());

        // Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];

        // Définition d'un tableau de noms de villes et un autre de nombres
        // d'habitants
        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

        // Les trois premiers éléments du tableau seront des villes,
        // et le reste, des capitales
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                Ville V = new Ville(tab[i], tab2[i], "france");
                tableau[i] = V;
            }

            else {
                Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
                tableau[i] = C;
            }
        }

        // Il ne nous reste plus qu'à décrire tout notre tableau !
        for (Ville v3 : tableau) {
            System.out.println(v3.decrisToi() + "\n");
        }

        for (Object obj : tableau) {
            System.out.println(obj.toString() + "\n");
        }

    }// Fin de la méthode main

}// Fin de votre classe
