import java.util.*;

public class NewsManager {

    static void displayKeywords() {

        System.out.println("\nSorted Suspicious Keywords:");

        for (String word : DataStore.sortedKeywords) {
            System.out.println(word);
        }
    }

    static void viewAllNews() {

        if (DataStore.newsDatabase.isEmpty()) {
            System.out.println("\nNo News Stored.");
            return;
        }

        System.out.println("\n NEWS DATABASE ");

        for (News n : DataStore.newsDatabase) {

            System.out.println("Source : " + n.source);
            System.out.println("Article: " + n.article);
            System.out.println("Score : " + n.score);
            System.out.println("Result : " + n.result);
            System.out.println(" ");
        }
    }

    static void searchNews(Scanner sc) {

        System.out.print("\nEnter Source Name To Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (News n : DataStore.newsDatabase) {

            if (n.source.equalsIgnoreCase(search)) {

                System.out.println("\nNews Found:");
                System.out.println("Article: " + n.article);
                System.out.println("Score : " + n.score);
                System.out.println("Result : " + n.result);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No News Found.");
        }
    }

    static void deleteNews(Scanner sc) {

        System.out.print("\nEnter Source Name To Delete: ");
        String source = sc.nextLine();

        Iterator<News> iterator =
                DataStore.newsDatabase.iterator();

        boolean deleted = false;

        while (iterator.hasNext()) {

            News n = iterator.next();

            if (n.source.equalsIgnoreCase(source)) {

                iterator.remove();
                deleted = true;
            }
        }

        if (deleted) {
            System.out.println("News Deleted Successfully.");
        }
        else {
            System.out.println("News Not Found.");
        }
    }

    static void viewHistory() {

        if (DataStore.history.isEmpty()) {

            System.out.println("\nNo History Available.");
            return;
        }

        System.out.println("\n ANALYSIS HISTORY ");

        for (News n : DataStore.history) {

            System.out.println("Source : " + n.source);
            System.out.println("Score : " + n.score);
            System.out.println("Result : " + n.result);
            System.out.println(" ");
        }
    }

    static void statistics() {

        int real = 0;
        int suspicious = 0;
        int fake = 0;

        for (News n : DataStore.history) {

            if (n.result.equals("LIKELY REAL NEWS"))
                real++;

            else if (n.result.equals("SUSPICIOUS NEWS"))
                suspicious++;

            else
                fake++;
        }

        System.out.println("\n PROJECT STATISTICS ");
        System.out.println("Total Analyzed News : "
                + DataStore.history.size());
        System.out.println("Real News : " + real);
        System.out.println("Suspicious News : " + suspicious);
        System.out.println("Fake News : " + fake);
        System.out.println(" ");
    }
}