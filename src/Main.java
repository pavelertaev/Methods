

public class Main {
    public static void printSeparator() {
        System.out.println("+++++++");
        System.out.println("--------");
    }
    public static void printIssues(int issuesCount){
        System.out.println(issuesCount);
    }
    public static int sum(int [] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public  static int calculateYears(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год высокосный");
        }else {
            System.out.println(year + " год не высокосный");
        }
        return year;
    }
    public static int getClientOS(int OS) {
        if (OS == 0) {
            System.out.println("Ваша версия устройства IOS");
        } else if (OS == 1) {
            System.out.println("Ваша версия устройства Android");
        }
        return OS;
    }
    public static int getCurrentYear(int year){
        if (year <2015){
            System.out.println("Установите облегченную версию");
        }else {
            System.out.println("Установите полную версию");
        }
        return year;
    }
    public static int calculateDistance(int deliveryDistance) {
        if(deliveryDistance<=20) {
            return  1;
        }else{
            return (int) Math.round((double) deliveryDistance / 40 ) +1;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);


        //Методы задание 1
        //Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль. 
        //*Эту проверку вы уже реализовывали в задании по условным операторам.*
        //Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
        //Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —* високосный год”.
        // Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.
        //*Подсказку с выполнением задания вы можете найти в шпаргалке урока.*
        System.out.println("Задание 1");
        int years = 2026;
         calculateYears(years);




        //Методы задание 2
        //Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
        //Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        //Текущий год можно получить таким способом:
            //int currentYear = LocalDate.now().getYear();
        // Или самим задать значение вручную, введя в переменную числовое значение.
        // В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения (обычную или lite)
        // и для какой ОС (Android или iOS) нужно установить пользователю.
        System.out.println("Задание 2");
        int OS = 1;
        int clientDeviceYear = 2020;
        getClientOS(OS);
        getCurrentYear(clientDeviceYear);


        //Методы задание 3
        //Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
        //Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        System.out.println("Задание 3");
        int distance = 100;
        calculateDistance(distance);
        System.out.println(calculateDistance(distance));













    }
}