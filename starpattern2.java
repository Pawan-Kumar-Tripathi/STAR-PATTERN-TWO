import java.io.*;
import java.util.*; 
class starpattern2 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter the no of rows and coloumn you want ");
        int num = sc.nextInt();
        int i,j;
        for(i=1;i<=num;i++)
        {
            for(j=i;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}