import java.util.Scanner;

/*
Ecrire un programme qui demande à l’utilisateur de saisir un nombre entier et qui affiche sa valeur
en binaire, octale et hexadécimale.
 */
public class Main {
    public static void main(String[] args) {
        int nombre = 0;// demander à l'utilisateur de saisir un nombre
        System.out.println("veuillez saisir un nombre entier :");
        Scanner sc =new Scanner(System.in);
        nombre = sc.nextInt();

        String binaire = Integer.toBinaryString(nombre);
        System.out.println("Voici votre nombre en binaire : " + binaire);

        String octale = Integer.toOctalString(nombre);
        System.out.println("Voici votre nombre en octale : " + octale);

        String hexadecimale = Integer.toHexString(nombre);
        System.out.println("Voici votre nombre en hexadécimale : " + hexadecimale);
    }
}