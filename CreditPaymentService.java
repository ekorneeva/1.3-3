public class CreditPaymentService {
    public int calculate(int sum, int term, double percentYear) {
        double percent = percentYear / 100 / 12;
        double percent1 = percent + 1;
        double term1 = term * 12;
        double result = sum * (percent + percent / (Math.pow(percent1, term1) - 1));
        return (int) result;
    }
}
