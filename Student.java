
public class Student {
	

    // 1. Give the class three private attributes: name, studentId, and grade.
    private String name;
    private String studentId;
    private double grade;

    // 2. Write a constructor that sets all three attributes.
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // 3. Write a getter for each attribute
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // 3. and a setter for grade.
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // 4. Write a method displayInfo() that prints the student's name, ID, and grade.
    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }

    // 5. In main , create two Student objects, change one student's grade using the setter, then call displayInfo() on both.
    public static void main(String[] args) {
        
        Student student1 = new Student("Victor Joseph Abad", "2026-6969", 90.1);
        Student student2 = new Student("Katyushanka Khatanova", "2026-6767", 91.2);

        student2.setGrade(89.8);

        student1.displayInfo();
        student2.displayInfo();
    }
}