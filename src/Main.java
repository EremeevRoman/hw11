public class Main {


    public static void main(String[] args) {
        newYear(2021);
        int operatingSystem = 1;
        int year = 2016;
        int result = count(operatingSystem, year);
        distance(95);


    }


    public static void newYear(int year) {

        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 400 != 0 || year % 100 == 0) {
            System.out.println(year + " Високосный год");
        } else {
            System.out.println(year + " Невисокосный год");

        }
    }

    public static int count(int operatingSystem, int year) {
        System.out.println("Задача 2");
        if (year < 2015) {
            if (operatingSystem == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (operatingSystem == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
        return 0;

    }

    public static void distance(int deliveryDistance) {
        System.out.println("Задача 3");
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется км " + deliveryDistance + " доставка занимает сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется км " + deliveryDistance + " доставка занимает двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется км " + deliveryDistance + " доставка занимает трое суток");
        } else {
            System.out.println(" Доставки нет");
        }
    }
}