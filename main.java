package java2.Practice;

import Practice.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentController stdCtrl = new StudentController();
        StudentView stdView = new StudentView();
        List<Student> stdList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Add student records\n" +
                    "2. Display student records\n" +
                    "3. Save\n" +
                    "4. Exit");
            System.out.println("Your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    stdList = stdView.addStudent();
                    break;
                case 2:
                    stdCtrl.displayStudent(stdList);
                    break;
                case 3:
                    stdCtrl.updateToDB(stdList);
                    break;
                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 4);
    }
}
