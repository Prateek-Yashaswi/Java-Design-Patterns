package Builder;

public class BuilderExec {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Student data = builder.setName("Prateek").setId(1).getObject();
        Student data1 = builder.setId(2).setName("Yashaswi").getObject();

        System.out.println(data);
        System.out.println(data1);
    }
}
