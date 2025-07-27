
import java.util.ArrayList;
import java.util.LinkedList;

public  class ll{
    public static void main(String[] args) {
        ArrayList <String> al=new ArrayList<>();
        al.add("x1");
        al.add("x2");
        al.add("x3");
        LinkedList<String> Ll=new LinkedList<>();
        Ll.add("y1");
        Ll.add("y2");
        Ll.add("y3");
        Ll.addAll(al);
        Ll.remove(2);
        System.out.println(Ll);


        
    }
}