import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String [][] courses = {
        {"01", "Statin", "Alvaro", "Farrel"},
        {"02", "Desjar", "Ajung", "Prabowo"},
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter student name:");
        String studentName = scanner.nextLine();

        int studentId = 0;
        boolean validInput = false;

        do {
            try{
                System.out.println("enter student ID :");
                studentId = scanner.nextInt();
                scanner.nextLine();
                //check
                if(studentId > 0){
                validInput =true;
                } else {
                    System.out.println("Invalid input, ID nya yang bener positif lah");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, IDnya diisi angka dong");
                scanner.nextLine();
            }
        } while (!validInput);
        System.out.println("Enter courses to enroll in (pisahin pake koma bang) :");
        String coursesToEnroll = scanner.nextLine();
        String[] coursesArray = coursesToEnroll.split(",");

        Student student = new Student(studentName, studentId);
       for (String course : coursesArray) {
        student.enrolledCourse(course.trim());
       }
       for (String[] course : courses) {
        System.out.println("\nCourse ID: " + course[0] + ",\nCourse Name : " + course[1]);
        for (int j = 2; j < course.length; j++) {
            System.out.println(" - Student: " + course[j]);
        }
       }
       Teacher teacher = new Teacher(":Pak Ardi Sitompul ", 5696);
       Admin admin = new Admin("Farrel", 8181);

       System.out.println(student.getUserDetails());
       teacher.teachClass("PO");
       admin.manageSystem();
       scanner.close();

                
    }
}

