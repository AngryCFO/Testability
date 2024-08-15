package Case3;


public class Main3 {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платёж при сроке кредита 1 год: " + (service.calculate(1_000_000, 1, 9.99)));
        System.out.println("Ежемесячный платёж при сроке кредита 2 года" + (service.calculate(1_000_000, 2, 9.99)));
        System.out.println("Ежемесячный платёж при сроке кредита 3 года" + (service.calculate(1_000_000, 3, 9.99)));
    }
}