package Library_Scenario;


import java.util.HashMap;

public class BooksOnProgrammingLang implements Library{
    private HashMap<String, Integer> map = new HashMap<>();

    public BooksOnProgrammingLang() {
        map.put("C++",50);
        map.put("PYTHON",80);
        map.put("JAVA",60);
        map.put("DART",10);
        map.put("JAVASCRIPT",40);
    }

    @Override
    public HashMap<String, Integer> check() {
        return this.map;
    }
}
