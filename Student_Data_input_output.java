import java.io.*;
import java.util.*;

public class Student_Data_input_output {
    String studentName, studentRollNumber;
    int subject_mark_one, subject_mark_two, subject_mark_three;
    double studentAverageMark;
    static String studentCollegeName;

    public void getStudentData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        studentName = sc.nextLine();
        System.out.println("Enter Student Roll Number");
        studentRollNumber = sc.nextLine();
        System.out.println("Enter Three Subject Marks");
        subject_mark_one = sc.nextInt();
        subject_mark_two = sc.nextInt();
        subject_mark_three = sc.nextInt();

    }
    
    public void showStudentData() {
        System.out.println("student Name :" + studentName);
        System.out.println("Student Roll Number:" + studentRollNumber);
        System.out.println("Student College Name:" + studentCollegeName);
        System.out.println("Student Subject Mark 1:" + subject_mark_one);
        System.out.println("Student Subject Mark 2:" + subject_mark_two);
        System.out.println("Student Subject Mark 3:" + subject_mark_three);
  
    }

    public static void main(String[] args) {
        Student_Data_input_output studentObject = new Student_Data_input_output();
       // studentObject.getStudentData();
        studentObject.studentCollegeName = "NGPiTECH";
       // studentObject.showStudentData();
         Student_Data_input_output studentObjectTwo = new Student_Data_input_output();
         System.out.println("studentCollegeName  :" + studentCollegeName);
         System.out.println("studentObject.studentCollegeName"+studentObject.studentCollegeName);
         System.out.println("studentObjectTwo" + studentObjectTwo.studentCollegeName);
         Student_Data_input_output[] arrayOfStudentObject = new Student_Data_input_output[10];
         for (int i = 0; i < 3; i++) {
             arrayOfStudentObject[i].getStudentData();
             arrayOfStudentObject[i].showStudentData();
            
            
         }
       
        
        
    }

}
