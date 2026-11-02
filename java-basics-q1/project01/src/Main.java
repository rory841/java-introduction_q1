import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clear the leftover newline buffer

        // Create an array to hold Student objects
        Student[] studentList = new Student[count];

        // Loop to populate the array with user input
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            int mark = scanner.nextInt();
            scanner.nextLine(); // Clear buffer for next string input

            // Instantiate object and assign to array slot
            studentList[i] = new Student(name, mark);
        }

        // Output section
        System.out.println("\n===== STUDENT RECORD RESULTS =====");
        for (int i = 0; i < studentList.length; i++) {
            studentList[i].displayDetails();
        }

        scanner.close();

        int[] numbers = null;
        int length = numbers.length;
        int firstNumber = numbers[0];
    }
}