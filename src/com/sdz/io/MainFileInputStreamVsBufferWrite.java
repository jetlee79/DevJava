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
        // Nous d�clarons nos objets en dehors du bloc try/catch
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

            // On r�cup�re le temps du syst�me
            long startime = System.currentTimeMillis();

            while (fis.read(buf) != -1) {
                fos.write(buf);
            }
            // On affiche le temps d'ex�cution
            System.out.println("Temps de lecture + �criture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startime));

            // on r�initialise
            startime = System.currentTimeMillis();

            while (bis.read(buf) != -1) {
                bos.write(buf);
            }
            // On r�affiche le temps d'ex�cution
            System.out.println("Temps de lecture + �criture avec BufferedInputStream et BufferedOutputStream : "
                    + (System.currentTimeMillis() - startime));

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
