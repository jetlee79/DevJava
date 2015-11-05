package com.sdz.jeu;
public class Medecin extends Personnage {

    @Override
    public void combattre() {
        if (this.armes.equals("pistolet")) {
            System.out.println("Attaque au pistolet !");
        } else {
            System.out.println("Vive le scalpel !");
        }
    }

    @Override
    public void soigner() {
        if (this.sacDeSoin.equals("petit sac")) {
            System.out.println("Je peux recoudre des blessures.");
        } else {
            System.out.println("Je soigne les blessures.");
        }
    }

}
