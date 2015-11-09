package com.sdz.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFileInputStreamVsBufferRead {

    public static void main(String[] args) {
        // Nous d�clarons nos objets en dehors du bloc try/catch
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream(new File("dictionnaire.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("dictionnaire.txt")));

            byte[] buf = new byte[8];

            // On r�cup�re le temps du syst�me
            long startime = System.currentTimeMillis();

            // Inutile d'effectuer des traitements dans notre boucle
            while (fis.read(buf) != -1) {
                ;
            }
            // On affiche le temps d'ex�cution
            System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startime));

            // on r�initialise
            startime = System.currentTimeMillis();

            // Inutile d'effectuer des traitements dans notre boucle
            while (bis.read(buf) != -1) {
                ;
            }
            // On r�affiche le temps d'ex�cution
            System.out.println("Temps de lecture avec BufferedInputStream : " + (System.currentTimeMillis() - startime));

        } catch (FileNotFoundException e) {
            // Cette exception est lev�e
            // si l'objet FileInputStream ne trouve aucun fichier
            e.printStackTrace();
        } catch (IOException e) {
            // Celle-ci se produit lors d'une erreur
            // d'�criture ou de lecture
            e.printStackTrace();
        } finally {
            // On ferme nos flux de donn�es dans un bloc finally pour s'assurer
            // que ces instructions seront ex�cut�es dans tous les cas
            // m�me si une exception est lev�e !
            try {
                if (fis != null) {
                    fis.close();
                }
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
