public class Customer {
    public String firstName;
    public String lastName;
    private String codePostal;
    private String city;

    // constructeur

    public Customer (String firstName, String lastName, String codePostal, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.codePostal = codePostal;
        this.city = city;
    }

    // methode

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

    public String getCodePostal(){
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
