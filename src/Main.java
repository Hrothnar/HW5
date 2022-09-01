public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 0; // 0 - iOS | 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        int clientDeviceYear = 2013;
        int versionLine = 2015;
        if (clientOS == 0 && clientDeviceYear >= versionLine) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < versionLine) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= versionLine) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }

        //task3
        int year = 2022;
        int yearCheck4 = year % 4;
        int yearCheck100 = year % 100;
        int yearCheck400 = year % 400;
        if ((yearCheck100 == 0 || yearCheck4 != 0) && yearCheck400 != 0) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год високосный");
        }

        //task4
        int deliveryDistance = 22;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней - 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней - 2");
        } else {
            System.out.println("Потребуется дней - 3");
        }

        //task5
        int month = 9;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца нет в году");
        }
    }
}