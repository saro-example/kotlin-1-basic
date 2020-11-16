package java.example;

class Class2JavaParent {
    public String hi() {
        return "HELLO";
    }
}

interface Class2JavaInterface {
    void out();
}

class Class2Java extends Class2JavaParent implements Class2JavaInterface {
    @Override
    public void out() {
        System.out.println(hi());
    }
}

class Class2Main {
    public static void main(String[] args) {
        new Class2Java().out();
    }
}

