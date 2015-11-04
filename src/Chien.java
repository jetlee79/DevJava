public class Chien extends Canin implements Rintintin {

    public Chien() {

    }

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    @Override
    void crier() {
        System.out.println("J'aboie sans raison ! ");
    }

    @Override
    public void faireCalin() {
        // TODO Auto-generated method stub

    }

    @Override
    public void faireLechouille() {
        // TODO Auto-generated method stub

    }

    @Override
    public void faireLeBeau() {
        // TODO Auto-generated method stub

    }

}
