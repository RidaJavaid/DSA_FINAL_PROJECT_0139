import java.util.*;

public class DataStore {

    static HashMap<String, Integer> keywords = new HashMap<>();
    static HashSet<String> trustedSources = new HashSet<>();
    static TreeSet<String> sortedKeywords = new TreeSet<>();
    static LinkedList<News> newsDatabase = new LinkedList<>();
    static ArrayList<News> history = new ArrayList<>();

    static void initializeData() {

        keywords.put("fake", 5);
        keywords.put("miracle", 4);
        keywords.put("secret", 3);
        keywords.put("viral", 3);
        keywords.put("breaking", 2);
        keywords.put("conspiracy", 5);
        keywords.put("click here", 5);
        keywords.put("unbelievable", 4);
        keywords.put("shocking", 3);

        trustedSources.add("bbc");
        trustedSources.add("cnn");
        trustedSources.add("reuters");
        trustedSources.add("aljazeera");
        trustedSources.add("dawn");

        sortedKeywords.addAll(keywords.keySet());
    }
}