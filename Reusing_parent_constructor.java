//reusing parent constructor
class Student
{
    String name;
    int age;
    Student(String n,int a)
    {
        name=n;
        age=a;
    }
}

class Job extends Student
{
    int salary_offered;
    Job(String k,int y,int s)
    {
        super(k,y);
        salary_offered=s;
    }
    void display()
    {
        System.out.println("name->"+name+" age->"+age+" salary_offered="+salary_offered);
    }
}

class Reusing_parent_constructor
{
    public static void main(String arg[])
    {
        Job j=new Job("vyshnavi",19,2100000);
        j.display();
    }
}