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

public class Main {
    public static void main(String[] args) {
        String[] mails = {
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

        int totalEmails = mails.length;
        int gmailCount = 0;

        for (String email : mails) {
            if (email.endsWith("@gmail.com")) {
                gmailCount++;
            }
        }

        double gmailPercentage = (double) gmailCount / totalEmails * 100;

        System.out.println("Pourcentage de fournisseurs de services mail :");
        System.out.println("Gmail : " + gmailPercentage + "%");
    }
}
