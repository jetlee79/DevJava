public class Test {

    public static void main(String[] args) {
        Loup l = new Loup("Gris bleut�", 20);
        // Animal l = new Loup("Gris bleut�", 20); --> fonctionne aussi avecun
        // type de r�f�rence Animal
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());
    }

}
