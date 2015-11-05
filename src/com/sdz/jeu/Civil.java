package com.sdz.jeu;
public class Civil extends Personnage {
    @Override
    public void combattre() {
        if (this.armes.equals("couteau")) {
            System.out.println("Attaque au couteau !");
        } else {
            System.out.println("Je ne combats PAS !");
        }
    }

}
