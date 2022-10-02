public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        public static void calculateIntercalaryYear ( double yearNumber ){
            yearNumber = 2022;
            if (yearNumber % 4 == 0) {
                if (yearNumber % 100 != 0 || yearNumber % 400 == 0) {
                    System.out.println(yearNumber + " - високосный год!");
                }
                System.out.println(yearNumber + " - невисокосный год!");

            }
            System.out.println(yearNumber + " - невисокосный год!");
        }
    }

    public static void task2() {
        String clientOS = "iOS";
        int currentYear = 2022;
        int deviceYear = 2020;
        public static int getApp (clientOS, deviceYear){
            if (deviceYear == currentYear) {
                if (clientOS.equals("iOS")) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                System.out.println("Установите версию приложения для Android по ссылке");

            } else if (clientOS.equals("iOS")) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
    }

    public static void task3() {
        int deliveryDistance = 95;
        public static int daysDelivery(deliveryDistance) {
        int distancePenality = 40;
        double idkWhatIsThis = (deliveryDistance - 61) / distancePenality;
        daysDelivery = Math.abs(idkWhatIsThis) + 3;
        double result = Math.ceil(daysDelivery);
        return daysDelivery;
        }
    }
    }

gg wp



