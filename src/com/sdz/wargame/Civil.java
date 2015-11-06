package com.sdz.wargame;
import com.sdz.comportement.Deplacement;
import com.sdz.comportement.EspritCombatif;
import com.sdz.comportement.Soin;

public class Civil extends Personnage {
    public Civil() {
    }

    public Civil(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
        super(esprit, soin, deplacement);
    }
}
