class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);        
       this.studentId = studentId;
    }

    public void displayStudentInfo() {
        displayPersonInfo();  
        System.out.println("Student ID: " + studentId);
    }
}

public class Single{
    public static void main(String[] args) {
        Student student = new Student("sakshi", 20, "1234");

        student.displayStudentInfo();
    }
}