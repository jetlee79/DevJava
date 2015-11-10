package com.sdz.io;


public class Notice {
    private final String langue;

    public Notice() {
        this.langue = "Français";
    }

    public Notice(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "\t Langue de la notice : " + this.langue + "\n";
    }
}
