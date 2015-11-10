package com.sdz.io;

import java.io.Serializable;

public class Game implements Serializable {
    private final String nom;
    private final String style;
    private final double prix;
    // Maintenant cette variable ne sera pas sérialisée
    // Elle sera tout bonnement ignorée !!
    private transient Notice notice;

    public Game(String nom, String style, double prix) {
        this.nom = nom;
        this.style = style;
        this.prix = prix;
        this.notice = new Notice();
    }

    @Override
    public String toString() {
        return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + "\n";
    }

}
