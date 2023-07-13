public class Client {
    public String nom;
    public String prenom;

    public String adresse;
    public String codePostal;
    public String ville;

    // constructeur
    public Client() {
    }

    public Client(String nom) {
        this();
        setNom(nom);
    }

    public Client(String nom, String prenom) {
        this(nom);
        setPrenom(prenom);
    }

    public Client(String nom, String prenom, String adresse) {
        this(nom, prenom);
        setAdresse(adresse);
    }

    public Client(String nom, String prenom, String adresse, String codePostal) {
        this(nom, prenom, adresse);
        setCodePostal(codePostal);
    }

    public Client(String nom, String prenom, String adresse, String codePostal, String ville) {
        this(nom, prenom, adresse, codePostal);
        setVille(ville);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.length() > 0) {
            this.nom = nom;
        } else {
            System.out.println("Le nom ne peut pas être vide");
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom.length() > 0) {
            this.prenom = prenom;
        } else {
            System.out.println("Le prénom ne peut pas être vide");
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        if (adresse.length() > 0) {
            this.adresse = adresse;
        } else {
            System.out.println("L'adresse ne peut pas être vide");
        }
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        if (codePostal.length() > 0) {
            this.codePostal = codePostal;
        } else {
            System.out.println("Le code postal ne peut pas être vide");
        }
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        if (ville.length() > 0) {
            this.ville = ville;
        } else {
            System.out.println("La ville ne peut pas être vide");
        }
    }

    public String toString() {
        return getNom() + " " + getPrenom() + " " + getAdresse() + " " + getCodePostal() + " " + getVille();
    }
}


}
