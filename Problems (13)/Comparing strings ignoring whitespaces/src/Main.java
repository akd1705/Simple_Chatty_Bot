import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        String strres=str.replace(" ","");
        String str1res=str1.replace(" ","");
        System.out.println(strres.equals(str1res));
        // put your code here
    }
}