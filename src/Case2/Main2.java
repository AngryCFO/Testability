package Case2;

public class Main2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        double weightInKilograms = 98;
        int bmi = service.calculate(heightInMeters, weightInKilograms); // должно получиться 28
        System.out.println("bmi-индекс: " + bmi);
    }
}
