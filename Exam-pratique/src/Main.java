import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("sara" , " awad" , 69002 , "lyon");
        Account compte1 = new Account(123456 , 100);

        while (true) {

            Scanner scanner = new Scanner (System.in);
            System.out.println("1) Compte");
            System.out.println("2) Solde");
            System.out.println("3) Déposser d'argent");
            System.out.println("4) Retirer d'argent");
            System.out.println("5) Quiter");
            System.out.print("Saisissez votre choix : ");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    customer1.getInformation();
                    System.out.println(customer1.getInformation());

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
                    double test = scanner.nextDouble();
                    compte1.setWithdraw(test);
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
