import java.util.Random;

public class Main {
            public static void main(String[] args) {
                Random test = new Random(); //classe random initalisé en tant que test
                int nombre1, nombre2, nombre3;

                do {
                    nombre1 = test.nextInt(1001); // nextINT  fournira un nombre aléatoire
                    nombre2 = test.nextInt(1001);
                    nombre3 = test.nextInt(1001);
                }
            while (!(nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 != 0)); // l’opérateur modulo (%) retourne le reste de la division , si le nombre est / par 2 est pair sinon impair
                System.out.println("num1 : " + nombre1 + ", num2 : " + nombre2 + ", num3 : " + nombre3);
            }
}