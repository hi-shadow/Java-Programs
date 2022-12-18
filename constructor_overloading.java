public class constructor_overloading
{
    int id;
    String name;

    constructor_overloading()
    {
        System.out.println("This is a default Constructor");

     }
     constructor_overloading(int i , String n)
    {
            id=i;
            name=n;
    }


    public static void main(String[] args) {
        Student s= new Student();
        System.out.println("default constructor values");
        System.out.println("Student id = "+s.id+" Student Name = "+s.name);
        System.out.println("Paramiterised Constructor");
        Student s1= new Student(1 , "Gautam");
        System.out.println("Student id = "+s1.id+"\n Student Name = "+s1.name);
        

    }
}
    

