public class MoneyPrint {
    public static void main(String[] args) {
        int refund = 25000;
        int[] moneyArray = new int[]{50000,10000,5000,1000,500,100,50,10};

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        // %d는 숫자를 넣을 수 있음

        System.out.printf("50000원 몫: %d, 나머지: %d\n",refund/curr50000, refund%curr50000);
        System.out.printf("10000원 몫:  %d, 나머지: %d\n",refund/curr10000, refund%curr10000);
        System.out.printf("5000원 몫: %d, 나머지: %d\n", refund/curr5000, refund%curr5000);
        System.out.printf("1000원 몫: %d, 나머지 %d\n", refund/curr1000,refund%curr1000);
        System.out.printf("500원 몫: %d, 나머지 %d\n", refund/curr500, refund%curr500);
        System.out.printf("100원 몫:  %d, 나머지 %d\n" ,refund/curr100, refund%curr100);

//        for (int money:
//             moneyArray) {
//            System.out.print(money + "원: ");
//            int num = refund / money;
//            System.out.print(num + "개");
//            System.out.println();
//            refund = refund % money;}

    }
}

