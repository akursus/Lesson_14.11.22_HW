public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задание 1");
        int age = 19;
        System.out.println("Возраст = " +age +" лет");
        if (age>=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age<18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и Вам нужно немного подождать");
        }
        //task2
        System.out.println("Задание 2");
        int personAge = 23;
        System.out.println("Возраст = " +personAge +" лет");
        if (personAge<7) {
            System.out.println("Ребёнок ещё мал для школы");
        }
        if (personAge>=7 && personAge<18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (personAge>=18 && personAge<24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (personAge>=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
}