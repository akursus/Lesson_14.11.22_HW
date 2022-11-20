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
        int personAge2 = 22;
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
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //task2.3
        System.out.println("Задание 2.3");
        int wagonCapacity2 = 102;
        int seatPlace2 = 60;
        int stadingPlace2 = wagonCapacity2 - seatPlace2;
        int seatTicket2 = 56;
        int stadingTicket2 = 40;
        int leftSeatPlace2 = seatPlace2 - seatTicket2;
        int leftStadingPlace2 = stadingPlace2 - stadingTicket2;
        System.out.println("Куплено " +seatTicket2 +" сидячих мест и " +stadingTicket2 +" стоячих мест");
        if (leftSeatPlace2>0 && leftStadingPlace2>0) {
            System.out.println("В вагоне осталось " + leftSeatPlace2 +" сидячих мест и " +leftStadingPlace2 +" стоячих мест");
        }
        else if (leftSeatPlace2<=0 && leftStadingPlace2>0) {
            System.out.println("В вагоне осталось " +leftStadingPlace2 +" стоячих мест");
        }
        else if (leftSeatPlace2>0 && leftStadingPlace2<=0) {
            System.out.println("В вагоне осталось " + leftSeatPlace2 +" сидячих мест");
        }
        else {
            System.out.println("В вагоне нет свободных мест");
        }
        //task3.1
        System.out.println("Задание 3.1");
        int personAge3 = 24;
        boolean kinderGarten = personAge3>=2 && personAge3<7;
        boolean school = personAge3>=7 && personAge3<18;
        boolean university = personAge3>=18 && personAge3<24;
        if (kinderGarten) {
            System.out.println("Если человеку " +personAge3 +" года (лет), то ему необходимо ходить в детский сад");
        }
        else if (school) {
            System.out.println("Если человеку " +personAge3 +" лет, то ему необходимо ходить в школу");
        }
        else if (university) {
            System.out.println("Если человеку " +personAge3 +" лет (года), то его место в университете");
        }
        else {
            System.out.println("Если человеку " +personAge3 +" лет (года), то ему пора ходить на работу");
        }
        //task3.2
        System.out.println("Задание 3.2");
        int childAge = 13;
        int adult = 0;
        boolean attractionNo1 = childAge < 5;
        boolean attractionNo2 = childAge >= 5 && childAge < 14 && adult <= 0;
        boolean attractionYes = childAge >= 5 && childAge < 14 && adult > 0;
        if (attractionNo1) {
            System.out.println("Ребенку " +childAge +" года, поэтому он не может кататься на аттракционе");
        }
        else if (attractionNo2) {
            System.out.println("Ребенку " + childAge + " лет и нет взрослого, поэтому он не может кататься на аттракционе");
        }
        else if (attractionYes) {
            System.out.println("Ребенку " + childAge + " лет и он с взрослым, поэтому он может кататься на аттракционе");
        }
        else {
            System.out.println("Ребенку " + childAge + " лет, поэтому он может кататься на аттракционе без сопровождения взрослого");
        }
        //task3.3
        System.out.println("Задание 3.3");
        int one = 12;
        int two = 3;
        int three = 3;
        if (one > two) {
            if (one >= three) {
                System.out.println(one +" самое большое число");
            } else {
                System.out.println(three +" самое большое число");
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println(two +" самое большое число");
            } else {
                System.out.println(three +" самое большое число");
            }
        } else {
            if (one > three) {
                System.out.println(one +" самое большое число");
            } else if (three > one){
                System.out.println(three +" самое большое число");
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }

}