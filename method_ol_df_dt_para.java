public class method_ol_df_dt_para {
    // if you want to declare methods and overload them so must be its starting with static keyword

        static int sum(int a , int b)
        {
            return a+b;
        }
        static float sum( float a , float b){
            return a+b;
        }
        public static void main(String[] args) {
            System.out.println(sum(10,10));
            System.out.println(sum(25.50f,24.50f)); // if you want to input as floating point number you must be end with "f" ...

    }
    
}
