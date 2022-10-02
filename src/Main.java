import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2022);
        getApp(0,2022);
        int deliveryDays = calculateDaysDelivery(666);
        System.out.println("Потребуется дней доставки " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        }
        System.out.println(year + " невисокосный год");
    }

    public static void getApp(int clientOS, int deviceYear){
        if (clientOS != 0 && clientOS != 1){
            throw new IllegalArgumentException("Такой OS не существует!");
        }
        int currentYear = LocalDate.now().getYear();
        if(deviceYear > currentYear){
            throw new IllegalArgumentException("Год производства не может быть больше текущего года!");
        }
        String osString = clientOS == 0 ? "iOS" : "Android";
        String versionString = deviceYear > 2015 ? "полную" : "облегчённую";
        System.out.printf("Установите %s версию для %s по ссылке%n", versionString, osString);
    }
    public static int calculateDaysDelivery(int deliveryDistance){
        if(deliveryDistance <=20){
            return 1;
        }else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}

