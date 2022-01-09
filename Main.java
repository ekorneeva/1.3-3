public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1000000;
        double percentYear = 9.99;
        int term = 1;
        int сreditPaymentSum = service.calculate(sum, term, percentYear);
        System.out.println(сreditPaymentSum);
        term = 2;
        сreditPaymentSum = service.calculate(sum, term, percentYear);
        System.out.println(сreditPaymentSum);
        term = 3;
        сreditPaymentSum = service.calculate(sum, term, percentYear);
        System.out.println(сreditPaymentSum);
    }
}
