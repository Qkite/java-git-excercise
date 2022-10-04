import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        if (inputNum%2==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
