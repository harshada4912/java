import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class List1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();

    System.out.println("Enter the number of elements you want to add:");
    int n = scanner.nextInt();
    scanner.nextLine(); 

    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
        String element = scanner.nextLine();
        arrayList.add(element);
    }

        ListIterator<String> listIterator = arrayList.listIterator();

        System.out.println("next element:");
        while (listIterator.hasNext()) {
            System.out.println("" + listIterator.next());
        }

        System.out.println("\n previous element:");
        while (listIterator.hasPrevious()) {
            System.out.println("" + listIterator.previous());
        }
    }
}