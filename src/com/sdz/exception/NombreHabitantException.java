package com.sdz.exception;

public class NombreHabitantException extends Exception {

    public NombreHabitantException() {
        System.out.println("Vous avez instancier une classe Ville avec un nombre n�gatif !");
    }

    public NombreHabitantException(int nbre) {
        System.out.println("Instanciation avec un nombre d'habitants n�gatif.");
        System.out.println("\t => " + nbre);
    }

}
