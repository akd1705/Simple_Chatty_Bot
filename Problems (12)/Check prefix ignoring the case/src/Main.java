import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if (str.startsWith("J") || str.startsWith("j"))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        // put your code here
    }
}