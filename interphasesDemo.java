interface camera {
    void click();

    void RecordVideo();
}

class SmartPhone implements camera {
    public void click() {
        System.out.println("Taking A Shot By MICC9e");

    }

    public void RecordVideo() {
        System.out.println("Recording A Video In HD Quality In MICC9e");

    }

   }


class interphasesDemo {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.click();
        sm.RecordVideo();
    }

}