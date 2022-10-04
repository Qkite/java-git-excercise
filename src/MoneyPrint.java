public class MoneyPrint {
    public static void main(String[] args) {
        int refund = 25000;
        int[] moneyArray = new int[]{50000,10000,5000,1000,500,100,50,10};

        for (int money:
             moneyArray) {
            System.out.print(money + "원: ");
            int num = refund / money;
            System.out.print(num + "개");
            System.out.println();
            refund = refund % money;

        }
    }
}
