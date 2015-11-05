package com.sdz.animal;
public class Loup extends Canin {

    public Loup() {

    }

    public Loup(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    @Override
    void crier() {
        System.out.println("J'hurle à la lune en faisant ouhouh ! ! ");
    }

}
