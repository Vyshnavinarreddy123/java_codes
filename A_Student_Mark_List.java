//student mark list processing
import java.util.*;
class A_Student_Mark_List
{
    public static void main(String args[])
    {
        String name;
        float m,sum=0,per=0,avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.nextLine();
        for(int i=1;i<=5;i++)
        {
            m=sc.nextFloat();
            sum=sum+m;
        }
        System.out.println("sum of marks of "+name +"is "+sum);
        System.out.println("average of marks of "+name +"is "+sum/5);
        System.out.println("sum of marks of "+name +"is "+sum/500);
        
        
    }
}