import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        int required=sc.nextInt();
        if (length*width>=required) {
            if (required % length == 0 || required % width == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        else {
            System.out.println("NO");
        }
        // put your code here
    }
}