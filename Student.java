public class Student {
    int id;
    String name;

    Student() {
        System.out.println("This is a default Constructor");

    }

 Student(int i , String n)
    {
            id=i;
            name=n;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("default constructor values");
        System.out.println("Student id = " + s.id + " \n Student Name = " + s.name);
        System.out.println();
        System.out.println("Paramiterised Constructor");
        Student s1 = new Student(1, "Jatin");
        System.out.println("Student id = " + s1.id + "\n Student Name = " + s1.name);

    }
}
