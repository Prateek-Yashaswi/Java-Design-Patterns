package Library_Scenario;

import java.util.HashMap;

public class BooksOnNetworking implements Library{

    private HashMap<String, Integer> map = new HashMap<>();

    public BooksOnNetworking() {
        map.put("COMPUTER NETWORKS",20);
        map.put("DATA COMMUNICATIONS",50);
        map.put("PROTOCOLS",10);
    }

    @Override
    public HashMap<String, Integer> check() {
        return this.map;
    }
}
