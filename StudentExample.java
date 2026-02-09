class Student {

    private String name;
    private int marks;

    public void setStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent("Rahul", 85);
        s.displayResult();
    }
}
