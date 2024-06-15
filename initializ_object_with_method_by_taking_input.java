//initialize object with method by taking input
import java.util.*;
class Student
{
    int age,rno;
    String name;
    void input(int a,int r,String n)
    {
        age=a;
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println("name->"+name+"\n rollnumber->"+rno+"\n age->"+age);
    }
}
class initializ_object_with_method_by_taking_input
{
    public static void main (String[] args) 
    {
        int age,r,i;
        String name;
        Student s1=new Student();
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=3;i++)
        {
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter name");
        sc.nextLine();
        name=sc.nextLine();
        System.out.println("enter rollnumber");
        r=sc.nextInt();
        s1.input(age,r,name);
        s1.display();
        }
        
        
        
        
    }
}