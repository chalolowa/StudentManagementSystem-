import java.util.Scanner;

public class Student {
    private final int studyYear;
    private String courses = null;
    private int tuitionBalance;
    private final static int courseFee = 600;
    private static int Id = 2000;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names of the student:");
        String fullName = input.next();

        System.out.println("Enter the year of study of the student i.e 1=1st, 2=2nd,....:");
        Scanner in = new Scanner(System.in);
        studyYear = in.nextInt();

        setStudentID();
    }

    private void setStudentID() {
        Id++;
        String studentID = studyYear + "" + Id;
        System.out.println("Your student ID is" + studentID);
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enroll or Q to quit");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + courseFee;
            } else {
                break;
            }
        } while(1 != 0);
        System.out.println("You have enrolled in:" + courses);
    }

    public void viewBalance() {
        System.out.println("Dear student, your tuition balance is $" + tuitionBalance);
    }

    public void payTuition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment:");
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        viewBalance();
    }

}
