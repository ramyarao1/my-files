class Employee {

    int id;
    String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        String s = "this is emp with id = " + this.name;

        return s;
    }


}

public class P1 {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "one");
        Employee e2 = new Employee(2, "two");
        String tmp =e1.toString();
        System.out.println(tmp);
        System.out.println(e1.toString());
        System.out.println(e1);

    }



}
