public class Article {
    public String nom;
    public int reference;
    public double prix;
    // constructeur
    //créer un constructeur qui demandera au moment
    // de créer un nouvel article de placer un nom, prix et reference
    public Article() {
    }
    public Article(String nom, int reference, double prix){
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;
    }

    //methode

    public String getNom() {
        return this.nom;
    }

    public void setNom(String pNom){
        this.nom = pNom;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int ref) {
        this.reference = ref;
    }

    public double getPrix() {
        return prix;
    }


}
