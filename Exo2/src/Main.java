/*
Exercice 2 :
Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux nombres pairs suivis par un nombre impair.
Si ce n’est pas le cas, recommencer jusqu’à ce que vous ayez la combinaison pair, pair, impair.
Afficher ensuite le nombre d’essais nécessaires pour obtenir cette combinaison.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random test = new Random(); //classe random initalisé en tant que test
        int nombre1, nombre2, nombre3;
        int essais = 0; // Variable de comptage des essais
        do {
            essais++; // Variable de comptage des essais
            nombre1 = test.nextInt(1001); // nextINT  fournira un nombre aléatoire
            nombre2 = test.nextInt(1001);
            nombre3 = test.nextInt(1001);
        }
        while (!(nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 != 0)); // l’opérateur modulo (%) retourne le reste de la division , si le nombre est / par 2 est pair sinon impair
        System.out.println("num1 : " + nombre1 + ", num2 : " + nombre2 + ", num3 : " + nombre3);
        System.out.println("Nombre d'essais nécessaires: " + essais);
    }
}

/*import java.util.Rando

public class Main {
    public static void main(String[] args) {
        Random test = new Random(); //classe random initalisé en tant que test
        for (int i = 0; i<3; i++) {
            int nombre = test.nextInt(1001); // nextINT  fournira un nombre aléatoire

            if (nombre % 2 == 0) // l’opérateur modulo (%) retourne le reste de la division , si le nombre est / par 2 est pair sinon impair
            System.out.println("Nombre aléatoire pair : " + nombre);
            else
                System.out.println("Nombre aléatoire impair : " + nombre);

        }
    }

}*/

