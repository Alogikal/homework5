
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("-----------------------");
        System.out.print("Укажите модель вашего смартфона, где 0 = iOS, 1 = Android: ");
        int clientOS = console.nextInt();
        String linkIOS = "https://blog.eldorado.ru/storage/publication/0/58/f7yIp6cPBZtZJtYVyJ8iu9FvtgJCF8LSVfAhbm9c.jpeg";
        String linkAndr = "https://i.pinimg.com/736x/0e/23/67/0e23674f40640af4c730344a860a4fd4.jpg";
        if (clientOS == 0) {
            System.out.print("Установите версию приложения для iOS по ссылке " + linkIOS);
        } else {
            System.out.println("Установите версию приложения для Android по ссылке " + linkAndr);
        }
        System.out.println("-----------------------" + "\n");

        System.out.println("Задача 2");
        System.out.println("-----------------------");
        System.out.println("Укажите модель вашего смартфона и год его выпуска через пробел, где 0 = iOS, 1 = Android: ");
        int clientOS2 = console.nextInt();
        String linkIOS2 = "<a href=https://ru.wikipedia.org/wiki/App_Store>iOS</a>";
        String linkAndr2 = "<a href=https://ru.m.wikipedia.org/wiki/Google_Play>Android</a>";
        String linkiOSNew = "https://upload.wikimedia.org/wikipedia/commons/e/e4/Original_iPhone_-_iPhone_3G_-_iPhone_4_-_Flickr_-_Yutaka_Tsutano.jpg";
        String linkAndrNew = "https://i.pinimg.com/736x/fe/21/8f/fe218f96fff462ea5e4f5c70b57bfb4f--best-android-best-phone.jpg";
        int clientDeviceYear = console.nextInt();
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке" + linkIOS);
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке" + linkAndr);
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке" + linkiOSNew);
        }
         else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке" + linkAndrNew);
        } else {
             System.out.println("Error!");
        }
        System.out.println("-----------------------" + "\n");

        System.out.println("Задача 3");
        System.out.println("-----------------------");
        System.out.print("Введите текущий год для определения високосности: ");
        int year = console.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Год " + year + " является високосным");
            } else {
            System.out.println("Год " + year + " не является високосным");
        }
        System.out.println("-----------------------" + "\n");

        System.out.println("Задача 4");
        System.out.println("-----------------------");
        System.out.println("Введите расстояние до вашего офиса: ");
        int distance = console.nextInt();
        int deliveryTime20 = 1;
        int deliveryTime20_60 = 2;
        int deliveryTime60_100 = 3;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime20);
        } else if (distance > 20 && distance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime20_60);
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется дней: " + deliveryTime60_100);
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
        System.out.println("-----------------------" + "\n");

        System.out.println("Задача 5");
        System.out.println("-----------------------");
        System.out.println("Введите номер месяца: ");
        int monthNumber  = console.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
                System.out.println("Сейчас весна");
            case 4:
                System.out.println("Сейчас весна");
                break;
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
                System.out.println("Сейчас лето");
            case 7:
                System.out.println("Сейчас лето");
                break;
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
                System.out.println("сейчас осень");
            case 10:
                System.out.println("Сейчас осень");
                break;
            case 11:
                System.out.println("Сейчас осень");
                break;
            case 12:
                System.out.println("Сейчас зима");
            default:
                break;

        }
        System.out.println("-----------------------" + "\n");
    }
}
