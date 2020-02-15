import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int n=scanner.nextInt();
        int temp=n;
       while(n>0)
        {
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println(sum);
        // put your code here
    }
}