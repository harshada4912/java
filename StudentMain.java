class Student {
    String name;
    int age;
    String ID;

    Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + ID);
    }
}

class Marks extends Student {
    int mathMarks;
    int scienceMarks;
    int englishMarks;

    Marks(String name, int age, String ID, int mathMarks, int scienceMarks, int englishMarks) {
        super(name, age, ID);
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    void displayMarks() {
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("English Marks: " + englishMarks);
    }
}

interface Skills {
    void displaySkills();
}

class StudentInfo extends Marks implements Skills {
    String[] skills;

    StudentInfo(String name, int age, String ID, int mathMarks, int scienceMarks, int englishMarks, String[] skills) {
        super(name, age, ID, mathMarks, scienceMarks, englishMarks);
        this.skills = skills;
    } 

    public void displaySkills() {
        System.out.println("Skills: ");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }

    void displayAllInfo() {
        displayInfo();
        displayMarks();
        displaySkills();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        String[] skills = {"Java", "Python", "C++"};
        StudentInfo student = new StudentInfo("harshada", 49, "S123", 85, 90, 88, skills);
        student.displayAllInfo();
    }
}