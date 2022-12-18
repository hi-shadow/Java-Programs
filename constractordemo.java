class box
{
    double h , w, d;
    box()
        {
            h=10;
            w=10;
            d=10;
        }
        double volume()
        {
            return h*w*d;
        }
}
public class constractordemo {
    public static void main(String[] args) {
            double vol;
            box b1= new box();
            box b2= new box();
            vol =b1.volume();

            System.out.println("volume of b="+vol);
            vol=b2.volume();
            System.out.println("volume of b2="+vol);

    }
    
}
