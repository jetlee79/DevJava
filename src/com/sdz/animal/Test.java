package com.sdz.animal;
public class Test {

    public static void main(String[] args) {

        Chien c = new Chien("Gris bleuté", 20);
        // Animal c = new Loup("Gris bleuté", 20); --> fonctionne aussi avecun
        // type de référence Animal
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("-------------------------------------------------");
        // Les méthodes de l'interface
        c.faireCalin();
        c.faireLeBeau();
        c.faireLechouille();

        System.out.println("-------------------------------------------------");
        // Utilisons le polymorphisme de notre interface
        Rintintin r = new Chien();
        r.faireLeBeau();
        r.faireCalin();
        r.faireLechouille();

    }

}
