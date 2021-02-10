import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator implements Comparator<String> {


    public static void main(String args[]) {

        String s1="abc";
        String s2="de";
        List<String> ls = null;

        ls.add(s1);
        ls.add(s2);
        Collections.sort(ls, new StringComparator());
        System.out.println(ls);



    }


    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length())
            return 1;
        else if (s1.length() < s2.length())
            return -1;
        else return 0;
    }




    }

