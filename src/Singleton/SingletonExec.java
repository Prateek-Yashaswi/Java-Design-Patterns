package Singleton;

public class SingletonExec {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        obj1.echoMessage("Hello World");

        System.out.println(obj1.getValue());
        obj1.setValue(100);

        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj2.getValue());

        System.out.println("Hence Single Instance Is Created");

    }
}
