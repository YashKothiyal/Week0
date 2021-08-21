import java.util.*;
public class Linear_Search
{
    public static void main(String[]args)
    {
            Scanner scan = new Scanner(System.in);
            int J=0,K=1;
            System.out.print("Enter Number of Elements in an Array : ");
            int n = scan.nextInt();
            int[]a=new int[n];
            System.out.print("Enter Elements in the Array ↓");
            for(int i=0;i<n;i++)
            {
               a[i]= scan.nextInt();
            }
            System.out.print("Enter the Element to be Searched : ");
            int x = scan.nextInt();
            for(int i=0;i<n;i++)
            {
                if(a[i]==x)
                {
                    J++;
                    break;
                }
                else
                {
                    K++;
                }
            }
            if(J==1)
            {
                System.out.println(x + " is PRESENT in the Array!");
            }
            else
            {
                System.out.println(x + " is NOT PRESENT in the Array!");
            }
        System.out.println("Total No of Comparisons : " + K);
    }
}
