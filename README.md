# Домашнее задание к занятию "Testability, авто-тесты, введение в ООП: объекты и методы"

##Case1
**BonusMilesService.java**
```java
package Case1;

public class BonusMilesService {
    public int calculate(int price) {
        return price / 20;
    }
}
```
**Main.java**
```java
package Case1;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Количество бонусных миль: " + miles);
    }
}
```
**Результат**
```
Количество бонусных миль: 500
```

##Case2
**BmiService.java**
```java
package Case2;

public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}
```
**Main2.java**
```java
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
```
**Результат**
```
bmi-индекс: 28
```

##Case3
**CreditPaymentService.java**
```java
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
```
**Main3.java**
```java
public class Main3 {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        
        System.out.println("Ежемесячный платёж при сроке кредита 1 год: " + (service.calculate(1_000_000, 1, 9.99)));
        System.out.println("Ежемесячный платёж при сроке кредита 2 года" + (service.calculate(1_000_000, 2, 9.99)));
        System.out.println("Ежемесячный платёж при сроке кредита 3 года" + (service.calculate(1_000_000, 3, 9.99)));
    }
}
```

**Результат**
```
Ежемесячный платёж при сроке кредита 1 год: 87911.24
Ежемесячный платёж при сроке кредита 2 года46140.31
Ежемесячный платёж при сроке кредита 3 года32262.49
```

### Файлы с кодом можно посмотреть в [папке](https://github.com/AngryCFO/Testability/tree/main/src)

