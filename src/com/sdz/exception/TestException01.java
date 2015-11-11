package com.sdz.exception;

public class TestException01 {

    public static void main(String[] args) {
        int j = 20, i = 0;
        try {
            System.out.println(j / i);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro !" + e.getMessage());
        }
        System.out.println("Coucou toi !");

        // try {
        // System.out.println(" =>" + 1 / 0);
        // } catch (ClassCastException e) {
        // e.printStackTrace();
        // } finally {
        // System.out.println("action faite systématiquement");
        // }

        Ville v = null;
        try {
            v = new Ville("Re", 12000, "France");
            // Gestion de l'exception sur le nombre d'habitants
        } catch (NombreHabitantException e) {
            e.printStackTrace();
            // Gestion de l'exception sur le nom de la ville
        } catch (NomVilleException e2) {
            System.out.println(e2.getMessage());
            // } finally {
            // if (v == null) {
            // v = new Ville();
            // }
            // }
            System.out.println(v.toString());
        }
    }

}
