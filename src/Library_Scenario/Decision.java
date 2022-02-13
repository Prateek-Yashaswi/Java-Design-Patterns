package Library_Scenario;

public class Decision {
    Factory factory = new Factory();
    Library book=null;
    public Decision(int data) {
        if(data==1){
            book = factory.getBook("PL");
        }

        else if(data==2){
            book = factory.getBook("DSA");
        }

        else if(data==3){
            book = factory.getBook("Networking");
        }
    }

    public Library getBook(){
        return this.book;
    }
}
