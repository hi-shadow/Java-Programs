public class wrapperdemo2 {
    public static void main(String[] args)
    {
        //converting to the integer 
        Integer a = new Integer(3);
        int i = a.intValue(); // convertoing to the Integer to int type Explicitly
        int j = a;

        System.out.println(a+" "+i+" "+j);
    }
}
