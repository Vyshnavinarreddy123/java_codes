//multi level inheritance
class School
{
    String name;
    int year;
    String sc_name;
    School(String n,int y,String sc_name)
    {
        name=n;
        year=y;
        this.sc_name=sc_name;
    }
    
}
class College extends School
{
    int age;
    String co_name;
    College(String n,int y,String sc_name,int a,String cname)
    {
        super(n,y,sc_name);
        age=a;
        co_name=cname;
    }
}
class University extends College
{
    String un_name;
    University(String n,int y,String sc_name,int a,String cname,String uname)
    {
        super(n,y,sc_name,a,cname);
        un_name=uname;
    }
    void display()
    {
        System.out.println("Name->"+name+"\t year->"+year+"\t schoolname->"+sc_name+"\n age->"+age+"\tcollegename"+co_name);
        System.out.println("universityname->"+un_name);
    }
}

class Multi-level-inheritance
{
    public static void main(String argd[])
    {
        University u=new University("lakshmi",2007,"gautham-high-school",34,"sri-chaitanya","sastra");
        u.display();
    }
}