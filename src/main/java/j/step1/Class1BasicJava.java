package j.step1;

import java.util.List;

public class Class1BasicJava {
    public Class1BasicJava() { }
    public Class1BasicJava(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String name = "String";
    private String type = "문자열";
    private String data1 = "DATA";
    final private String data2 = "DATA";

    public void out() {
        System.out.println(name + ": " + type);
    }

    public static void main(String[] args) {
        List.of(
                new Class1BasicJava("Integer", "정수"),
                new Class1BasicJava(),
                new Class1BasicJava("String", "사용자지정")
        ).forEach(e -> e.out());
    }
}

