import java.util.*;

public class List2 {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("69");
        arrayList.add("1");
        arrayList.add("26");
        arrayList.add("14");
        arrayList.add("26");

        ListIterator<String> listIterator = arrayList.listIterator();

        System.out.println("Forward Traverse:");
        while (listIterator.hasNext()) {
            System.out.println(" " + listIterator.next());
        }

        System.out.println("\nBackward Traverse:");
        while (listIterator.hasPrevious()) {
            System.out.println(" " + listIterator.previous());
        }
    }
}