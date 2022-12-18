public class instance_block {
    // instance initialization block
    {
        System.out.println("1st IIB block");
    }
    {
        System.out.println("2nd IIB block");
    }
    instance_block()
    {
        System.out.println("construnctor called");
    }
    {
        System.out.println("3rd IIB block");
    }
    public static void main(String[] args) {
        instance_block a= new instance_block();
        
    }
    
}
