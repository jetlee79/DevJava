import com.sdz.comportement.Operation;

public class TestJeuComportement {

    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

        for (int i = 0; i < tPers.length; i++) {
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }

        System.out.println("\nRedéfinir comportement du soin pour un Guerrier via son mutateur");
        System.out.println("************************************");
        Personnage pers = new Guerrier();
        pers.soigner();
        pers.setSoin(new Operation());
        pers.soigner();

    }

}
