public class Main {
    public static void main(String[] args) {
        int age1 = 17;

        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        int temperature = 4;

        if (temperature < 5) {
                    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задача 3
        int speed = 50;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
        //Задача 4
        int age = 20;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Возраст не попадает в заданные категории.");
        }
        //Задача 5
        int age3 = 15;

        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", нельзя кататься на аттракционе.");
        }else if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", можно кататься на аттракционе в сопровождении взрослого.");
        }else if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Задача 6
        int place = 61;

        if (place > 102){
            System.out.println("Если количество пассажиров в вагоне равно " + place + ", мест нету.");
        }else if (place < 60) {
            System.out.println("Если количество пассажиров в вагоне равно " + place + ", есть сидячие места.");
        }else if (place > 60 && place < 102) {
            System.out.println("Если количество пассажиров в вагоне равно " + place + ", есть стоячие места.");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        int max;

        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }
        System.out.println("Наибольшее число: " + max);
    }
}


