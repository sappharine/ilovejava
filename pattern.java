import java.util.*;
public class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        double s=0;
        double s1=0;double f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            s=s+(i/f); //factorial-first one
            if(i%2==0) //odd-eve 2nd
            s1=s1-i;
            else
            s1=s1+i;
        }
        System.out.println(s);
        System.out.println(s1);
    }
}
            