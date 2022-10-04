package odd_even;
import java.util.Scanner;

public class OddEvenCal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        if (num1%2==1){
            System.out.print("홀수");
        } else{
            System.out.print("짝수");
        }

        System.out.print("+");

        int num2 = scan.nextInt();
        if (num2%2==1){
            System.out.print("홀수");
        } else{
            System.out.print("짝수");
        }

        System.out.print("=");

        int num3 = num1 + num2;

        if (num3%2==1){
            System.out.print("홀수");
        } else{
            System.out.print("짝수");
        }
    }


}
