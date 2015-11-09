package com.sdz.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFileInputStreamVsBufferRead {

    public static void main(String[] args) {
        // Nous déclarons nos objets en dehors du bloc try/catch
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream(new File("dictionnaire.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("dictionnaire.txt")));

            byte[] buf = new byte[8];

            // On récupère le temps du système
            long startime = System.currentTimeMillis();

            // Inutile d'effectuer des traitements dans notre boucle
            while (fis.read(buf) != -1) {
                ;
            }
            // On affiche le temps d'exécution
            System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startime));

            // on réinitialise
            startime = System.currentTimeMillis();

            // Inutile d'effectuer des traitements dans notre boucle
            while (bis.read(buf) != -1) {
                ;
            }
            // On réaffiche le temps d'exécution
            System.out.println("Temps de lecture avec BufferedInputStream : " + (System.currentTimeMillis() - startime));

        } catch (FileNotFoundException e) {
            // Cette exception est levée
            // si l'objet FileInputStream ne trouve aucun fichier
            e.printStackTrace();
        } catch (IOException e) {
            // Celle-ci se produit lors d'une erreur
            // d'écriture ou de lecture
            e.printStackTrace();
        } finally {
            // On ferme nos flux de données dans un bloc finally pour s'assurer
            // que ces instructions seront exécutées dans tous les cas
            // même si une exception est levée !
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
