package Library_Scenario;

import java.util.HashMap;

public class Return {
    private HashMap<String, Integer> all = new HashMap<>();
    public Return(HashMap<String, Integer> books, String data){
        if(books.containsKey(data)){
            int cur = books.get(data);
            cur++;
            books.replace(data,cur);
        }

        else{
            books.put(data,1);
        }

        all.putAll(books);
    }

    public HashMap<String, Integer> getAll() {
        return all;
    }
}
