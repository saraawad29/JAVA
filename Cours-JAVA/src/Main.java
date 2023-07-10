import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ageDeTom = 20;
        int ageDeTamel = ageDeTom;
        ageDeTom = 44;
        System.out.println(ageDeTom);
        System.out.println(ageDeTamel);

        Date naissanceDeJasim = new Date(1578, 10, 3 );
        Date autreDate = naissanceDeJasim;
        naissanceDeJasim.setTime(4444);

        System.out.println(autreDate);
        System.out.println(naissanceDeJasim);
    }

}

