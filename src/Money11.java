import java.util.Scanner;
import java.util.Scanner;

public class Money11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        System.out.println("50000원: " + money/50000 + "개");
        System.out.println("10000원: " + (money%50000)/10000 + "개");
        System.out.println("5000원: " + (money%10000)/5000 + "개");
        System.out.println("1000원: " + (money%5000)/1000 + "개");
        System.out.println("500원: " + (money%1000)/500 + "개");
        System.out.println("100원: " + (money%500)/100 + "개");
        System.out.println("50원: " + (money%100)/50 + "개");
        System.out.println("10원: " + (money%50)/10 + "개");

        }
}
