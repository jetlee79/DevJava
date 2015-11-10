package com.sdz.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Classe qui compare le temps de lecture et ecriture entre un objet
 * FileInputStream contre BufferedInputStream et FileOutputStream contre un
 * BufferedOutputStream. Le but est de montrer que le Buffer est plus performant
 */
public class MainFileInputStreamVsBufferWrite {

    public static void main(String[] args) {
        // Nous déclarons nos objets en dehors du bloc try/catch
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream(new File("dictionnaire.txt"));
            fos = new FileOutputStream(new File("dictionnaire2.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("dictionnaire.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("dictionnaire3.txt")));

            byte[] buf = new byte[8];

            // On récupère le temps du système
            long startime = System.currentTimeMillis();

            while (fis.read(buf) != -1) {
                fos.write(buf);
            }
            // On affiche le temps d'exécution
            System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startime));

            // on réinitialise
            startime = System.currentTimeMillis();

            while (bis.read(buf) != -1) {
                bos.write(buf);
            }
            // On réaffiche le temps d'exécution
            System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : "
                    + (System.currentTimeMillis() - startime));

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
                if (fos != null) {
                    fos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
