import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int len=num.length();
        int sum=0,sum1=0;
        for (int i=0;i<len/2;i++)
        {
            sum=sum+num.charAt(i);
        }
        for (int j=len/2;j<len;j++)
        {
            sum1=sum1+num.charAt(j);
        }
        if (sum==sum1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}