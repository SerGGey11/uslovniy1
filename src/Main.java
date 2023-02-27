public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Человек соверешеннолетний");
            if (age < 18) {
                System.out.println("То надо дождать совершеннолетия");
            }
            System.out.println();
        }
    }

    public static void task2() {
        int tt = 4;
        if (tt < 5) {
            System.out.println("На улице холодно нужно надеть шапку");
        }
        if (tt > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        int speed1 = 75;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + " ,придёться заплатить штраф");
        }
        int speed2 = 55;
        if (speed2 <= 60) {
            System.out.println("Если скорость " + speed2 + " ,можно ехать спокойно");
        }
    }

    public static void task4() {
        int age = 4;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age +
                    " года, то ему надо ходить в детский сад");
        }
        int age2 = 15;
        if (age2 >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    " лет, то ему надо ходить в школу");
        }
        int age3 = 23;
        if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 +
                    " года, то он должен учиться в институте");
        }
        int age4 = 27;
        if (age4 >24){
            System.out.println("Если возраст человека равен " + age4 +
                    " лет, то ему пора ходить на работу");
        }
    }
    public static void task5(){
        int age = 4;
        if (age < 5){
            System.out.println("Если возраст ребёнка равен " + age +
                    " года, то ему нельзя кататься на аттракционе");
        }
        int age1 = 8;
        if (age1 >5 && age1 <14){
            System.out.println("Если ребёнку " + age1 +
                    " лет, то он может кататься только со взрослым");
        }
        int age2 = 16;
        if (age2 >14){
            System.out.println("Если возраст ребёнка достиг " + age2 +
                    " лет, то он может кататься без взрослых");
        }
    }
}

