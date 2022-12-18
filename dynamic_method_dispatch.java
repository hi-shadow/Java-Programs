class first {
    int hello() {
        System.out.println("Hello , From Class One");
        return 0;
    }

    int gm() {
        System.out.println("Good Morning");
        return 0;
    }
}

class second extends first {

    @Override
    int hello() {

        System.out.println("Hello , From Class Second");
        return 0;
    }
    int ga() {
        System.out.println("Good Morning");
        return 0;
    }

}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        first obj = new second();
        obj.hello();
        obj.gm();
        // obj.ga();   //  this is not allowed bcz you created a object of sub class and refers to super class soo you only calls method of super class

    }

}
