import java.util.*;
class WeightCheck extends Exception
{
    int w;
    WeightCheck(String s)
    {
        super(s);
    }
}
class weight_pblm_stmt
{
    public static void main (String[] args) 
    {
        int w;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight");
        w=sc.nextInt();
        try
        {
           if(w<800)
           {
               throw new WeightCheck("invalid weight");
           }
           else
           {
               throw new WeightCheck("valid weight");
           }
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
}