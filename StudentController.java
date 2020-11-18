package java2.Practice;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    String url = "jdbc:mysql://localhost:3306/Student";
    String username = "root";
    String password = "";

    public void displayStudent(List<Student> list){
        System.out.printf("%-30s%-30s%-30s%-30s\n","StudentID","Student Name","Address","Phone");
        System.out.printf("%-30s%-30s%-30s%-30s\n","B01010","Nguyen Tuan Anh ","Ha Noi","0904818238");
        System.out.printf("%-30s%-30s%-30s%-30s\n","B10394","Nguyen Hoang Hai ","Hai Duong","0494949494");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
        }
    }
    public boolean updateToDB(List<Student> list){
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String insert;
            int count = 0;
            for(int i = 0; i< list.size();i++){
                insert = "insert into student(studentID,studentName,address,phone) values('"+list.get(i).getStudentID()+"','"+list.get(i).getName()+"','"+list.get(i).getAddress()+"',"+list.get(i).getPhone()+")";
                count += stmt.executeUpdate(insert);
            }
            System.out.println(count + " row(s) affected");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}