package com.sdz.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe qui va créer 4 objets Game et les sérialiser dans un fichier. Puis on
 * va les désérialiser afin de pouvoir les réutiliser. Utilisation des objets
 * ObjectInputStream et ObjectOutputStream
 */
public class MainSerialisationObjectInputOutputStream {

    public static void main(String[] args) {
        // Nous déclarons nos objets en dehors du bloc try/catch
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));

            // Nous allons écrire chaque objet Game dabs le fichier
            oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
            oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
            oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
            // Ne pas oublmier de fermer le flux !
            oos.close();

            // On récupère maintenant les données
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));

            System.out.println("Affichage des jeux :");
            System.out.println("******************************************\n");
            System.out.println(((Game) ois.readObject()).toString());
            System.out.println(((Game) ois.readObject()).toString());
            System.out.println(((Game) ois.readObject()).toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (FileNotFoundException e) {
            // Cette exception est levée
            // si l'objet FileInputStream ne trouve aucun fichier
            e.printStackTrace();
        } catch (IOException e) {
            // Celle-ci se produit lors d'une erreur
            // d'écriture ou de lecture
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (oos != null) {
                    oos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
