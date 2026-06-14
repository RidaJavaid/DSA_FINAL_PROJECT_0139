import java.util.*;

public class FakeNewsAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DataStore.initializeData();

        int choice;

        do {

            System.out.println("\n");
            System.out.println(" ");
            System.out.println(" FAKE NEWS DETECTION ANALYZER");
            System.out.println(" ");
            System.out.println("1. Analyze News");
            System.out.println("2. Display Keywords (TreeSet)");
            System.out.println("3. View All News (LinkedList)");
            System.out.println("4. Search News");
            System.out.println("5. Delete News");
            System.out.println("6. View History (ArrayList)");
            System.out.println("7. Statistics");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    NewsAnalyzer.analyzeNews(sc);
                    break;

                case 2:
                    NewsManager.displayKeywords();
                    break;

                case 3:
                    NewsManager.viewAllNews();
                    break;

                case 4:
                    NewsManager.searchNews(sc);
                    break;

                case 5:
                    NewsManager.deleteNews(sc);
                    break;

                case 6:
                    NewsManager.viewHistory();
                    break;

                case 7:
                    NewsManager.statistics();
                    break;

                case 8:
                    System.out.println(
                            "Thank You For Using The Project.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}