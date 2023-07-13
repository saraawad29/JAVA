import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu1 = 0;
        while (menu1 != 3) {
            System.out.println("Saisissez votre choix :");
            System.out.println("1) Création du compte");
            System.out.println("2) Login");
            System.out.println("3) Quiter");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String createAccount;

                    System.out.println("Votre prénom:");
                    String firstName = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Votre nom:");
                    String lastName = scanner.nextLine();

                    System.out.println("Votre code postale :");
                    int postalCode = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Votre ville:");
                    String city = scanner.nextLine();

                    Customer newcustomer = new Customer(firstName, lastName, postalCode, city);

                    System.out.println("Compte crée. " + firstName + "!");
                    System.out.println();

                    // Affichez les informations du compte créé
                    newcustomer.displayInfo();
                    break;

                case 2:
                    String login;
                    System.out.println("Votre prénom:");
                    firstName = scanner.next();

                    System.out.println("Votre nom:");
                    lastName = scanner.next();

                    // Affichez un message de connexion réussie avec le nom du client
                    System.out.println("Connexion réussie. " + firstName + "!");
                    System.out.println();

                    break;
            }


            Customer customer1 = new Customer("sara", " awad", 69002, "lyon");
            Account compte1 = new Account(123456, 100);


            int menu2 = 0;
            while (menu2 != 5) {

                //scanner = new Scanner(System.in);
                System.out.println();
                System.out.println("----ATM----");
                System.out.println("1) Compte");
                System.out.println("2) Solde");
                System.out.println("3) Déposser de l'argent");
                System.out.println("4) Retirer de l'argent");
                System.out.println("5) Quiter");
                System.out.print("Saisissez votre choix : ");
                menu2 = scanner.nextInt();
                switch (menu2) {

                    case 1:
                        customer1.displayInfo();
                        break;
                    case 2:
                        compte1.getBalance();
                        System.out.println(compte1.getBalance());
                        break;
                    case 3:
                        System.out.println("Montant à déposser : ");
                        double amount = scanner.nextDouble();
                        compte1.setDeposit(amount);
                        break;
                    case 4:
                        System.out.println("Montant à retier : ");
                        double amountW = scanner.nextDouble();
                        compte1.setWithdraw(amountW);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalide choix");
                        break;
                }
            }
        }
    }
}


