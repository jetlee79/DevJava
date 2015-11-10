package com.sdz.nio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileChannel fc = null;

        try {
            // Création des objets
            fis = new FileInputStream(new File("dictionnaire.txt"));
            bis = new BufferedInputStream(fis);
            // Démarrage du chrono
            long time = System.currentTimeMillis();
            // Lecture
            while (bis.read() != -1) {
                ;
            }
            // Temps d'execution
            System.out.println("Temps d'execution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));

            // Création d'un nouveau flux de fichier
            fis = new FileInputStream(new File("dictionnaire.txt"));
            // On récupère le canal
            fc = fis.getChannel();
            // On en déduit la taille
            int size = (int) fc.size();
            // On crée un buffer
            // correspondant à la taille du fichier
            ByteBuffer bBuff = ByteBuffer.allocate(size);

            // Démarrage du chrono
            time = System.currentTimeMillis();
            // Démarrage de la lecture
            fc.read(bBuff);
            // On prépare à la lecture avec l'appel à flip
            bBuff.flip();
            // Temps d'execution
            System.out.println("Temps d'execution avec un nouveau buffer : " + (System.currentTimeMillis() - time));

            // Puisque nous avons utilisé un buffer de byte
            // afin de récupérer les données, nous pouvons utiliser
            // un tableau de byte
            // La méthode array retourne un tableau de byte
            byte[] tabByte = bBuff.array();

        } catch (FileNotFoundException e) {
            // Cette exception est levée
            // si l'objet File.... ne trouve aucun fichier
            e.printStackTrace();
        } catch (IOException e) {
            // Celle-ci se produit lors d'une erreur
            // d'écriture ou de lecture
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (fc != null) {
                    fc.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
