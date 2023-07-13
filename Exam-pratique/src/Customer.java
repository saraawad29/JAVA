public class Customer {
    public String createAccount;
    public String login;
    public String firstName;
    public String lastName;
    private int codePostal;
    private String city;

    // constructeur

    public Customer (String firstName, String lastName, int codePostal, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.codePostal = codePostal;
        this.city = city;
    }
    // methode
    public void displayInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Postal Code: " + codePostal);
        System.out.println("City: " + city);
    }

    public String setCreateAccount(){
        this.createAccount = createAccount;
        return createAccount;
    }

    public String setLogin(){
        this.login = login;
        return login;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCodePostal(){
        return codePostal;
    }

    public void setCodePostal(){
        this.codePostal = codePostal;
    }

    public String getCity(){
        return city;
    }

    public void setCity(){
        this.city = city;
    }

}
