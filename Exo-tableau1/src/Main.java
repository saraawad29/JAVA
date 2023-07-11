/*
	▪ Créez un tableaux contenant 1@ String , et remplir ce tableau avec des adresses mail, exemple
		“jpp@sfr.fr”;
		 “tom@gmail.com”;
		“fred@sfr.fr”;
		 “victor@sfr.fr” ;
		“chris@sfr.fr” ;
		“robert@orange.fr”;
		 “paul@sfr.fr” ;
		“lise@gmail.com”;
		 “thierry@isitech.fr”;
		 “marie@isitech.fr”;

	Calculez le pourcentage de fournisseurs de services mail.
(pour une adresse @gmail.com le fournisseur est gmail).
 */

public class Main { // main : déclarée comme une classe
    public static void main(String[] args) { // tableau du chaine du caractere , la taille de tableau est fixe et décidé automatiquement
        String[] arrayEmails = {
                "jpp@sfr.fr",
                "tom@gmail.com",
                "fred@sfr.fr",
                "victor@sfr.fr",
                "chris@sfr.fr",
                "robert@orange.fr",
                "paul@sfr.fr",
                "lise@gmail.com",
                "thierry@isitech.fr",
                "marie@isitech.fr"
        };

        int totalEmails = arrayEmails.length; // recupere la taille du tableau, length représente la longueur d'une chaine de caractères,
        int gmailCount = 0;  // variable déclarée à 0

        for (String email : arrayEmails) { // email c'est variable , ici on declare une boucle for de type string
            if (email.endsWith("@gmail.com")) { // pour vérifier que les mail se termine par gmail.com
                gmailCount++;
            }
        }

        double gmailPercentage = (double) gmailCount / totalEmails * 100;

        System.out.println("Gmail : " + gmailPercentage + "%");
    }
        public void test(String[] arrayEmails){
            test(arrayEmails);
            for (String reslt : arrayEmails){
                System.out.println(reslt);
            }

        }
}
