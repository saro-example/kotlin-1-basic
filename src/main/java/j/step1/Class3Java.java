package j.step1;

import k.step1.Class3;

public class Class3Java {
    public static void main(String[] args) {
        var clazz = new Class3();
        // data class 를 자바에서 사용시
        // getter, setter 를 자동으로 만들어 준다.
        System.out.println(clazz.getName());
        System.out.println(clazz.getType());
        System.out.println(clazz.getNameAndTypeProps());
    }
}

