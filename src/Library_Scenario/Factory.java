package Library_Scenario;

public class Factory {
    public Library getBook(String data){
        if(data.equalsIgnoreCase("PL"))
            return new BooksOnProgrammingLang();
        else if(data.equalsIgnoreCase("Networking"))
            return new BooksOnNetworking();
        else if(data.equalsIgnoreCase("DSA"))
            return new BooksOnDSA();
        return null;
    }
}
