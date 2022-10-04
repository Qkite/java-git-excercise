public class MoneyPrint2 {
    public static void main(String[] args) {
        int refund = 25410;

        //step2

        System.out.printf("50000원: %d장, 나머지: %d\n",refund/50000, refund%50000);
        refund = refund % 50000;
        System.out.printf("10000원:  %d장, 나머지: %d\n",refund/10000, refund%10000);
        refund = refund % 10000;
        System.out.printf("5000원: %d장, 나머지: %d\n", refund/5000, refund%5000);
        refund = refund % 5000;
        System.out.printf("1000원: %d장, 나머지 %d\n", refund/1000,refund%1000);
        refund = refund % 1000;
        System.out.printf("500원: %d장, 나머지 %d\n", refund/500, refund%500);
        refund = refund % 500;
        System.out.printf("100원:  %d장, 나머지 %d\n" ,refund/100, refund%100);
        refund = refund % 100;
        System.out.printf("50원: %d장, 나머지 %d\n", refund/50, refund%50);
        refund = refund % 50;
        System.out.printf("10원:  %d장, 나머지 %d\n" ,refund/10, refund%10);
    }
}
