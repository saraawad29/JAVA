/*
Créer une classe représentant un article d’un magasin de vente par en ligne.
Un article est caractérisé par sa référence, sa désignation, son prix.
créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.
 */

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Article art = new Article("bague", 52675665, 10);
        System.out.println("Article : " + art.getNom() );
        art.setNom("Necklace");
        System.out.println("Nouveau article : " + art.getNom() );
        System.out.println("Refernece : " + art.getReference() );
        art.setReference(784578);
        System.out.println("Nouvelle refernece : " + art.getReference() );
        System.out.println("Prix : " + art.getPrix() );

    }
}