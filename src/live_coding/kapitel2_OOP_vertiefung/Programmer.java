package live_coding.kapitel2_OOP_vertiefung;

class Employee{
    float salary;
}
class Programmer extends Employee{

    int bonus=10000;

    public static void main(String args[]){
        Employee employee = new Employee();
        employee.salary = 10;
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}