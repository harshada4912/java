import java.util.Scanner;

 class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                int[] arr = {10, 20, 30, 40,50};
        
               System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
                System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                position = i;
                break;
            }
        }
        
              if (position != -1) {
            System.out.println("Element " + searchElement + " is found at position " + (position + 1));
        } else {
            System.out.println("Element " + searchElement + " is not found in the array.");
        }
        
        
        scanner.close();
    }
}