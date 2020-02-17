import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         int num3=sc.nextInt();
         if(num3>=num1 && num3<=num2)
         {
             System.out.println("Normal");
         }
         else if (num3>num2)
         {
             System.out.println("Excess");
         }
         else
         {
             System.out.println("Deficiency");
         }
        // put your code here
    }
}