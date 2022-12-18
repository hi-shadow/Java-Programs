import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.addFirst(10);
        a.addLast(20);

        for(int i=0; i<a.size(); i++)
        {
            System.out.print(a.get(i));
            System.out.print(",");
        }

    }
    
}
