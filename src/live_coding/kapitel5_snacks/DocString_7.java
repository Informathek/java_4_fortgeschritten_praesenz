package live_coding.kapitel5_snacks;

/*
*
*
*
* */
class Student {
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    /* printsoemthing ist eine methode, die einen bestimmten text printetn, naemlich: "I live java"
    *
    * @author: Mohammad
    * @version: 0.1.2
    *
    * */
    void printSomething(){
        System.out.println("I live java");
    }

    /* calcNote die semthode macht so un so
     *
     * @author Mohammad
     * @version 0.1.2
     * @throws Arethemetische Exeception if we devide by zer0.
     * @param note: (int) value that will be used to calcaulatee the grade of the student.
     * return note: (int) der zehnfache wert von der note
     * */
    int calcNote(int note){
        try{
            note = 10/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return note;
    }

}


public class DocString_7 {
    private static void extracted_methode() {
        Math.pow(1,3);
        int x = 4;
        System.out.println(x);
        int y = 7;
        int ergebnis = x/6 * 7+y;
    }


    public static void main(String[] args) {

        extracted_methode();

        int x = 7;
        System.out.println(x);

    }

}
