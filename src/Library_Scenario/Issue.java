package Library_Scenario;

import java.util.HashMap;

public class Issue {
    private HashMap<String, Integer> all = new HashMap<>();
    private boolean flag = false;
    public Issue(HashMap<String, Integer> books, String data) {
        if(books.containsKey(data) && books.get(data)>0){
            int cur = books.get(data);
            cur--;
            books.replace(data,cur);
            all.putAll(books);
            flag=true;
        }
    }

    public HashMap<String, Integer> getAll() {
        return all;
    }

    public boolean isIssued() {
        return flag;
    }
}
