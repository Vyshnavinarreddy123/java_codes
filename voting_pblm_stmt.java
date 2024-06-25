import java.util.*;
class AgeException extends Exception
{
    int age;
    AgeException(String s)
    {
        super(s);
    }
}
class voting_pblm_stmt
{
    public static void main (String[] args) 
    {
        int age;
        AgeException a;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter age");
       age=sc.nextInt();
       try {
           
       
       if(age<18)
       {
            throw new AgeException("invalid age for voting");
       }
       else
       {
            throw new AgeException("valid age for voting");
       }
       }
       catch(AgeException e)
       {
           e.printStackTrace();
       }
       
       
    }
}