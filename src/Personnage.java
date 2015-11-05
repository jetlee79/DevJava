public abstract class Personnage {

    protected String armes = "", chaussure = "", sacDeSoin = "";

    /**
     * M�thode de d�placement de personnage
     */
    public void seDeplacer() {
        System.out.println("Je me d�place � pied.");
    }

    /**
     * M�thode que les combattants utilisent
     */
    public void combattre() {
        System.out.println("Je ne combats PAS !");
    }

    /**
     * M�thode de soin
     */
    public void soigner() {
        System.out.println("Je ne soigne pas.");
    }

    protected void setArmes(String armes) {
        this.armes = armes;
    }

    protected void setChaussure(String chaussure) {
        this.chaussure = chaussure;
    }

    protected void setSacDeSoin(String sacDeSoin) {
        this.sacDeSoin = sacDeSoin;
    }
}
