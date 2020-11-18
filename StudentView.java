package java2.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    List<Student> stdList = new ArrayList<>();

    public List<Student> addStudent(){
        StudentController stdCrl = new StudentController();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Student Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Student Phone:");
        String phone = scanner.nextLine();
        Student obj = new Student(id,name,address,phone);
        stdList.add(obj);
        System.out.println("Student has been added");
        return stdList;
    }
}
