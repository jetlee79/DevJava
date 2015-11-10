package com.sdz.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class MainUseStringWriterReader {

    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        StringReader sr = null;

        try {
            sw.write("Coucou les Z�ros");
            // Appel de la m�thode toSTring
            // de notre objet de mani�re tacite
            System.out.println(sw);

            // caw.close() n'a aucun effet sur le flux
            // Seul caw.reset() peut tout effacer
            sw.close();

            // On passe un tableau de caract�res � l'objet
            // qui va lire le tampon
            sr = new StringReader(sw.toString());
            int i;
            // On remet tous les caract�res lus dans un String
            String str = "";
            while ((i = sr.read()) != -1) {
                str += (char) i;
            }

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sw != null) {
                    sw.close();
                }
                if (sr != null) {
                    sr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
