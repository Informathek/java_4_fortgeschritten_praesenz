package live_coding.kapitel4_OOP_vertiefung2;

// Agenda:
// DONE: 1. Listen motivation
// Done: 2. Objekt Class
// Done: 3. abstract / interface
// Done: 4. arrays
// Done: 5. String / new String / String methods
// Done 6. wrapper class allgemein
// Done: 7. interger Class
// 8. collection framework


class TheInteger{
    private String value;

    TheInteger(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }


}
public class Strings {
    public static void main(String[] args) {
        // Wrapper class: Integer, Float, Character, Boolean
        int alter = 90;
        String vorName = "Amar";
        System.out.println(vorName.charAt(0));
        String myStringObjekt_nachName = new String("Mueller");
        System.out.println(myStringObjekt_nachName);

        System.out.println(vorName.length());
        System.out.println(myStringObjekt_nachName.length());
        System.out.println(vorName.charAt(0));

        String myInt = new String("khaled");

        Double doubleObjekt = 2.7;
        System.out.println(doubleObjekt.intValue());


        String myStringObjekt_nachName1 = new String("Mueller");
        String myStringObjekt_nachName2 = "Mueller";

        TheInteger myInt_obj = new TheInteger("Mohammad");
        TheInteger Integer = new TheInteger("Mohammad");
        System.out.println(myInt_obj);

    }
}

