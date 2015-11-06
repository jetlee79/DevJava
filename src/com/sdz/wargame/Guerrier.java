package com.sdz.wargame;
import com.sdz.comportement.CombatPistolet;
import com.sdz.comportement.Deplacement;
import com.sdz.comportement.EspritCombatif;
import com.sdz.comportement.Soin;

public class Guerrier extends Personnage {
    public Guerrier() {
        this.espritCombatif = new CombatPistolet();
    }

    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
        super(esprit, soin, deplacement);
    }
}
