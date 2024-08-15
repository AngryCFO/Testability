package Case2;

public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}
