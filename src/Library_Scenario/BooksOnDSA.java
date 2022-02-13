package Library_Scenario;

import java.util.HashMap;

public class BooksOnDSA implements Library{
    private HashMap<String, Integer> map = new HashMap<>();

    public BooksOnDSA() {
        map.put("ALGORITHMS UNLOCKED", 15);
        map.put("ALGORITHMS DESIGN MANUAL", 25);
        map.put("INTRODUCTION TO ALGORITHMS", 5);
        map.put("ALGORITHMS MADE EASY", 85);
    }

    @Override
    public HashMap<String, Integer> check() {
        return this.map;
    }
}
