import java.sql.SQLOutput;

public class Kage {
    public static void main(String[] args) {
        // Chesecake bund:
    int oreoStk = 60;
    int smør = 5; //spsk
    int oreoGram = 500; //g
    int smørGram = 100; //g

        //Chesecake fyld:
    int piskefløde = 500; //ml
    int piskeflødeGram = 470; //g
    int smøreost = 250; //ml
    int smøreostGram = 250; //g
    int vaniljesukker = 1; //spsk
    int vaniljesukkerGram = 10; //g
    int flormelis = 4; //spsk
    int flormelisGram = 40; //g

        //Vægt før bagning:
        String gramingredienser = ("oreoGram + smørGram + piskeflødeGram + smøreostGram + vaniljesukkerGram + flormelisGram");
        System.out.println(oreoGram + smørGram + piskeflødeGram + smøreostGram + vaniljesukkerGram + flormelisGram + "g");

        //Vægt efter bagning:
    int totalvægt = 1370;//g
    double EfterBagning = totalvægt * 0.9;
    System.out.println ("Vægt efter bagning: "  + EfterBagning + "g");

    //Protein pr ingrediens
    int piskeflødeProtein = 10; //g
    int smøreostProtein = 17; //g
    String proteiner = ("piskeflødeProtein + smøreostProtein");
    System.out.println(piskeflødeProtein + smøreostProtein + "g samlet mængde proteinindhold");

    }
}
