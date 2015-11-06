package com.sdz.wargame;
import com.sdz.comportement.Deplacement;
import com.sdz.comportement.EspritCombatif;
import com.sdz.comportement.PremierSoin;
import com.sdz.comportement.Soin;

public class Medecin extends Personnage {
    public Medecin() {
        this.soin = new PremierSoin();
    }

    public Medecin(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
        super(esprit, soin, deplacement);
    }

}
