import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable <Student> {
    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        String msg = "The students " + name+ " id = "+this.id;
        return msg;
    }


     public int compareTo1(Student s){
        String n1 = this.name;
        String n2 = this.name;

        //return n1.compareTo(n2);
        if ( this.name.length() < s.name.length() )
            return -1;
        else if (n1.length() > n2.length())
            return 1;
        else
            return 0;
     }

@Override
    public int compareTo(Student s) {
    if (this.id < s.id)
        return -1;
    else if (this.id > s.id)
        return 1;
    else
        return 0;
}

    public static void main(String[] args) {

        Student s = new Student("Amy", 2);
        Student s1 = new Student("Sam", 1);


        ArrayList<Student> stList = new ArrayList<>();
        stList.add(s);
        stList.add(s1);
        System.out.println(stList);

        Collections.sort(stList);

        System.out.println(stList);


        ArrayList<String> ls = new ArrayList();
        ls.add("zaples");
        ls.add("Grapes");
        ls.add("Pears");


        Collections.sort(ls);
        for (String fruit : ls) {
            System.out.println(fruit);
        }


    }

}


