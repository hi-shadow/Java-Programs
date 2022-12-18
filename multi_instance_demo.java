class multi_instance_demo {

    {
        System.out.println("This is First IIB");
    }
    {
        System.out.println("This is Second IIB");
    }

    multi_instance_demo() {
        System.out.println("Constructor called");
    }

    {
        System.out.println("This is Third IIB");
    }

    public static void main (String[] args) {
        multi_instance_demo a = new multi_instance_demo();
    }

}