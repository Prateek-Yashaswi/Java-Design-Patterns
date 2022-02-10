package Singleton;

public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();
    private SingletonClass(){}

    private int value;

    public static SingletonClass getInstance(){
        return instance;
    }

    public void echoMessage(String data){
        System.out.println("Echo Message: "+data);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
