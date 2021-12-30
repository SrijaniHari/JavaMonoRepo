import java.util.Date;

class Student{
    private String rollNo;
    private String name;
    private String department;
    private String address;
    private static int count=1;

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getRollNo() { return rollNo; }
    public String getDepartment() { return department; }

    public void setAddress(String address) { this.address = address; }
    public void setDepartment(String department) { this.department = department; }

    private String generateRollNO(){
        Date d = new Date();
        String rn = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }

    public Student(String name,String department,String address){
        rollNo = generateRollNO();
        this.name = name;
        setDepartment(department);
        setAddress(address);
    }

    public String toString(){
        return "\n Student Name:- "+name+"\n Roll No:- "+rollNo+"\n Department:- "+department+"\n Address:- "+address;
    }
}
public class StudentRollNumber {
    public static void main(String[] args) {
        Student s1 = new Student("Moubani Hari","CSE","Nabapolly Boys' School Road,Barasat");
        Student s2 = new Student("Srijani Hari","ECE","Nabapolly Boys' School Road,Barasat");
        Student s3 = new Student("Rupam Hari","EE","Nabapolly Boys' School Road,Barasat");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
