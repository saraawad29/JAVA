/*
Exercice 3 :

Creez un juste prix en console avec un affichage du temps et du nombre de tentatives
mises par l'utilisateur pour trouver le juste prix.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 100) + 1;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        userGuessNumber = userInput.nextInt();
        while (userGuessNumber != secretNumber) {
            if (userGuessNumber < secretNumber) {
                System.out.println("too low");
                userGuessNumber = userInput.nextInt();
            } else if (userGuessNumber > secretNumber) {
                System.out.println("too high");
                userGuessNumber = userInput.nextInt();
            }
        };
        System.out.println("Yes, You Win the Game!");
    }
}