import javax.sound.sampled.SourceDataLine;

public class method_ol_num_para {
   static int sum(int a , int b){
        return a+b;
    }
   static int sum (int a , int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,10));
        System.out.println(sum(10,20,30));
    }
    
}
