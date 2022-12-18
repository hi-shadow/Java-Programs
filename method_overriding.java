/*

when you create a method of same name with same parameters in sub class who extends a super class 
thats called METHOD OVERRIDING

*/

class first {
    int hello() {
        System.out.println("Hello , From Class One");
        return 0;
    }

    static int gm() {
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

}

class method_overriding {
    public static void main(String[] args) {

        second obj = new second();
        System.out.println();
        System.out.println();
        
        obj.hello();
        obj.gm();
        
        System.out.println();
        System.out.println();
    }
}