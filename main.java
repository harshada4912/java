import java.util.Scanner;

class Student {
    String regNumber;
    String name;

    public Student() {
        regNumber = "1";
        name = "abc";
    }

    public Student(String regNumber, String name) {
        this.regNumber = regNumber;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Name: " + name);
    }
}
1
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter registration number: ");
        String regNumber = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Student defaultStudent = new Student();
        System.out.println("\nStudent details using default constructor:");
        defaultStudent.displayInfo();

        Student paramStudent = new Student(regNumber, name);
        System.out.println("\nStudent details using parameterized constructor:");
        paramStudent.displayInfo();
    }
}