import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num1=sc.nextInt();
        long num2=sc.nextInt();
        long result=1;
        for (long i=num1;i<num2;i++)
        {
            result*=i;
        }
        System.out.println(result);

        // put your code here
    }
}