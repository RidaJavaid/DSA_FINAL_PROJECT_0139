import java.util.*;

public class NewsAnalyzer {

    static int calculateScore(String article) {

        article = article.toLowerCase();
        int score = 0;

        for (Map.Entry<String, Integer> entry :
                DataStore.keywords.entrySet()) {

            if (article.contains(entry.getKey())) {
                score += entry.getValue();
            }
        }

        return score;
    }

    static String classifyNews(int score, String source) {

        if (DataStore.trustedSources.contains(source.toLowerCase())) {
            score -= 3;
        }

        if (score <= 3) {
            return "LIKELY REAL NEWS";
        }
        else if (score <= 8) {
            return "SUSPICIOUS NEWS";
        }
        else {
            return "LIKELY FAKE NEWS";
        }
    }

    static void analyzeNews(Scanner sc) {

        System.out.print("\nEnter News Source: ");
        String source = sc.nextLine();

        System.out.print("Enter News Article: ");
        String article = sc.nextLine();

        int score = calculateScore(article);
        String result = classifyNews(score, source);

        News news = new News(source, article, score, result);

        DataStore.newsDatabase.add(news);
        DataStore.history.add(news);

        System.out.println("\n ANALYSIS REPORT ");
        System.out.println("Source : " + source);
        System.out.println("Fake Score : " + score);
        System.out.println("Result : " + result);
        System.out.println(" ");
    }
}