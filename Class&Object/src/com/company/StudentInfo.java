package com.company;
import java.util.Scanner;

class Student{
    public long roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int totalMarks(){
        return m1+m2+m3;
    }
    public double averageOfMarks(){
        return (double) (totalMarks()/3);
    }
    public char grade(){
        if(totalMarks()>=70)
            return 'A';
        else if(totalMarks()>=60 && totalMarks()<70)
            return 'B';
        else if(totalMarks()>=50 && totalMarks()<60)
            return 'C';
        else if(totalMarks()>=40 && totalMarks()<50)
            return 'D';
        else
            return 'F';
    }
    public String toString() {
        return "\n" + "Name : " + name + "\n" + "Roll : " + roll + "\n" + "Course : " + course + "\n";
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("Enter name:");
        Scanner s=new Scanner(System.in);
        s1.name=s.nextLine();
        System.out.println("Enter roll no:");
        s1.roll=s.nextLong();
        s.nextLine();
        System.out.println("Enter course name:");
        s1.course=s.nextLine();
        System.out.println("Enter the marks of the subjects:");
        s1.m1=s.nextInt();
        s1.m2=s.nextInt();
        s1.m3=s.nextInt();
        System.out.println("Details : " + s1);
        System.out.println("Total marks : " + s1.totalMarks());
        System.out.println("Average of marks : " + s1.averageOfMarks());
        System.out.println("Grade : " + s1.grade());
    }
}
