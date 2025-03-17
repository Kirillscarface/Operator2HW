public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        //Задание 2
        int clientOS2 = 1;
        int clientDeviceYear = 2011;
        if (clientDeviceYear < 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS2 == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("неизвестня операционная система");
            }
        } else {
            if (clientOS2 == 0) {
                System.out.println("Установите приложения для ios по ссылке"); }
            else if (clientOS2 == 1) {
                System.out.println("Установите приложения для Android по ссылке"); }
            else {
                System.out.println("Неизвестная операционная система"); }
            }

        //Задача 3
        int year = 2024;

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }

        //Задача 4
        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
            System.out.println("Доставка на данное расстояние невозможна.");
        }
        if (deliveryDays > 0)
            System.out.println("Потребуется дней: " + deliveryDays);

        //Задание 5
        int monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Неверный номер месяца.");
            return;
        }
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "Неизвестный сезон";
        }
        System.out.println(monthNumber + "-й месяц принадлежит к сезону " + season);
        }
        }
