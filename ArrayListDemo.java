import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(2,10);

        for(int i=0; i<a.size(); i++)
        {
            System.out.print(a.get(i));
            System.out.print(",");
        }

    }
}