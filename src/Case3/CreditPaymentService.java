package Case3;

public class CreditPaymentService {
    public double calculate(double amount, int years, double annualRate) {
        double monthlyRate = annualRate / 12 / 100;
        int numberOfPayments = years * 12;

        double monthlyPayment = amount *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        return Math.round(monthlyPayment * 100.0) / 100.0;
    }
}
