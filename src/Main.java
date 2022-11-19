public class Main {
    public static void main(String[] args) {
        //task1.1
        System.out.println("Задание 1.1");
        int age = 19;
        System.out.println("Возраст = " +age +" лет");
        if (age>=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age<18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и Вам нужно немного подождать");
        }
        //task1.2
        System.out.println("Задание 1.2");
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
        //task1.3
        System.out.println("Задание 1.3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int stadingPlace = wagonCapacity - seatPlace;
        int seatTicket = 50;
        int stadingTicket = 12;
        int leftSeatPlace = seatPlace - seatTicket;
        int leftStadingPlace = stadingPlace - stadingTicket;
        System.out.println("Куплено " +seatTicket +" сидячих мест и " +stadingTicket +" стоячих мест");
        if (leftSeatPlace>0 && leftStadingPlace>0) {
            System.out.println("В вагоне осталось " + leftSeatPlace +" сидячих мест и " +leftStadingPlace +" стоячих мест");
        }
        if (leftSeatPlace<=0 && leftStadingPlace>0) {
            System.out.println("В вагоне осталось " +leftStadingPlace +" стоячих мест");
        }
        if (leftSeatPlace>0 && leftStadingPlace<=0) {
            System.out.println("В вагоне осталось " + leftSeatPlace +" сидячих мест");
        }
        if (leftSeatPlace<=0 && leftStadingPlace<=0) {
            System.out.println("В вагоне нет свободных мест");
        }
        //task2.1
        System.out.println("Задание 2.1");
        int age2 = 15;
        System.out.println("Возраст = " +age2 +" лет");
        if (age2>=18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и Вам нужно немного подождать");
        }
        //task2.2
        System.out.println("Задание 2.2");
        int personAge2 = 28;
        System.out.println("Возраст = " +personAge2 +" лет");
        if (personAge2<7) {
            System.out.println("Ребёнок ещё мал для школы");
        }
        else if (personAge2>=7 && personAge2<18) {
            System.out.println("Ребёнок ходит в школу");
        }
        else if (personAge2>=18 && personAge2<24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (personAge2>=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

}