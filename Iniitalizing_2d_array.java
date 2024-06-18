class Iniitalizing_2d_array
{
    public static void main(String arg[])
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            System.out.println(" ");
            for(int j=0;j<3;j++)
            {
                System.out.println("array["+i+"]["+j+"]="+array[i][j]);
                System.out.println("\t");
            }
        }
}
}