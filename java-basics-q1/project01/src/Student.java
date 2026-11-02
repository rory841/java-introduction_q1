// Blueprint Class
public class Student {
    // Instance variables / Attributes
    String name;
    int mark;

    // Constructor
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    void displayGrade(){}

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (this.mark >= 75) {
            return 'A';
        } else {
            return (char)(this.mark >= 50? 'B':'F');
        }

    }

    // Method to display student information
    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Mark         : " + mark);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("----------------------------------");
    }


}