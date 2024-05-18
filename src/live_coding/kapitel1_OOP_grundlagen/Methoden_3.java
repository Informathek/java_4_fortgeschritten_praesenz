package live_coding.kapitel1_OOP_grundlagen;

public class Methoden_3 {
    int name;
    static String land;

    static void mehrereDingePrinten(int haeufigkeit){
        for (int i=0; i<haeufigkeit; i++){
            System.out.println(i + " I Love java");
        }
    }

    static double dreiEckFlaeche(double basis, double hoehe){
        double ergebnis = basis * hoehe / 2;
        return ergebnis;
    }

    public static void main(String[] args) {
        mehrereDingePrinten(3);
        System.out.println("--------------");
        mehrereDingePrinten(6);
        System.out.println("--------------");
        mehrereDingePrinten(10);
        System.out.println("--------------");



        double ergebnis2 = dreiEckFlaeche(7.9, 1.999999);
        double ergebnis3 = dreiEckFlaeche(4.2, 8);
        double ergebnis4 = dreiEckFlaeche(1, 1);

        System.out.println(dreiEckFlaeche(5, 7));
        System.out.println(ergebnis2);
        System.out.println(ergebnis3);
        System.out.println(ergebnis4);


    }
}
