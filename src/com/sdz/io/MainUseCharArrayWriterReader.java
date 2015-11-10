package com.sdz.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class MainUseCharArrayWriterReader {

    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();
        CharArrayReader car = null;

        try {
            caw.write("Coucou les Z�ros");
            // Appel de la m�thode toSTring
            // de notre objet de mani�re tacite
            System.out.println(caw);

            // caw.close() n'a aucun effet sur le flux
            // Seul caw.reset() peut tout effacer
            caw.close();

            // On passe un tableau de caract�res � l'objet
            // qui va lire le tampon
            car = new CharArrayReader(caw.toCharArray());
            int i;
            // On remet tous les caract�res lus dans un String
            String str = "";
            while ((i = car.read()) != -1) {
                str += (char) i;
            }

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (caw != null) {
                caw.close();
            }
            if (car != null) {
                car.close();
            }
        }

    }

}
