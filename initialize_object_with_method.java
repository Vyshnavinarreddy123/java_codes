//initialize object with method
class Student
{
    int rollno;
    String name;
    int age;
    void initialize(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("name of the student->"+name+"\n rollno of the "+name+"->"+rollno+"\n age of the "+name+"->"+age);
    }
}
class initialize_object_with_method
{
    public static void main(String arg[])
    {
        Student s1=new Student();
        s1.initialize(1,"vyvi",32);
        s1.display();
        Student s2=new Student();
        s2.initialize(2,"vyshnavi",33);
        s2.display();
    }
}