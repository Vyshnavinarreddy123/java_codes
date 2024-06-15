//initialize object with constructor
class Student
{
    int age,rno;
    String name;
    Student(int a,int r,String n)
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
class initialize_object_with_constructor
{
    public static void main (String[] args) 
    {
        Student s1=new Student(21,1,"klu1");
        Student s2=new Student(22,2,"klu2");
        Student s3=new Student(23,3,"klu3");
        s1.display();
        s2.display();
        s3.display();
    }
}