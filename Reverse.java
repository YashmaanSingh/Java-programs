
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to Reverse: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num !=0){
        int a = num % 10;
        rev = rev *10 + a;
        num = num / 10;
    }
    System.out.print("The reverse number is: "+ rev);
    }
}