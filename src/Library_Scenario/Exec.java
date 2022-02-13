package Library_Scenario;
import java.util.HashMap;
import java.util.Scanner;

public class Exec {

    private static void printBooks(HashMap<String, Integer> m){
        for(String key: m.keySet())
            System.out.println(key+" -> "+m.get(key));
    }

    private static void issueBooks(Library book, String issueBook){
        Issue i = new Issue(book.check(),issueBook);
        if(i.isIssued()){
            HashMap<String, Integer> newData = i.getAll();
            printBooks(newData);
            System.out.println("\nBook Issued\n");
        }

        else{
            System.out.println("Entry Invalid, Book Not Issued");
        }
    }

    private static void returnBooks(Library book, String returnBook) {
        Return r = new Return(book.check(),returnBook);
        printBooks(r.getAll());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Programming Languages, 2: DSA, 3: Networking");
        int input = sc.nextInt();
        Decision decision = new Decision(input);
        Library book = decision.getBook();
        System.out.println("1: Issue, 2: Return");
        int issueOrReturn = sc.nextInt();
        sc.nextLine();
        if(issueOrReturn==1){
            System.out.println("All Available Books And Their Quantities Are: ");
            printBooks(book.check());
            System.out.println("Enter The Book You Want To Issue");
            String issueBook = sc.nextLine().toUpperCase();
            issueBooks(book,issueBook);
        }

        else if(issueOrReturn==2){
            System.out.println("Enter Book You Want To Return");
            String returnBook = sc.nextLine().toUpperCase();
            returnBooks(book,returnBook);
            System.out.println("\nBook Returned\n");
        }

        else{
            System.out.println("\nInvalid Input\n");
        }
    }
}
