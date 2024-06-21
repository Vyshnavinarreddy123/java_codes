//static variable usage
import java.util.*;
class Student
{
    int no;
    String name;
    static String sname="GAUTHAM";
    Student(int n,String na)
    {
        no=n;
        name=na;
    }
    void display()
    {
        System.out.println("name:"+name+"age:"+no+"school-name:"+sname);
    }
}
class static_variable_usage
{
    public static void main (String[] args) 
    {
        Student s1=new Student(1,"lila");
        s1.display();
        Student s2=new Student(2,"sheela");
        s2.display();
        Student s3=new Student(3,"vani");
        s3.display();
        Student s4=new Student(4,"pooja");
        s4.display();
    }
}
