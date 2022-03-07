import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] Args) {
        System.out.println("Enter number of students you wish to enroll:");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

    }
}
