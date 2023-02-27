public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1(){
        int age = 18;
        if (age >= 18) {
            System.out.println("Человек соверешеннолетний");
            if (age < 18) {
                System.out.println("То надо дождать совершеннолетия");
            }
            System.out.println();
        }
    }
    public static void task2(){
        int tt = 4;
        if (tt < 5){
            System.out.println("На улице холодно нужно надеть шапку");
        }
        if (tt > 5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        }
        public static void task3(){
        int speed1 = 75;
        if (speed1 >= 60){
            System.out.println("Если скорость " + speed1 + " ,придёться заплатить штраф");
        }
        int speed2 = 55;
        if (speed2 <= 60){
            System.out.println("Если скорость " + speed2 + " ,можно ехать спокойно");
        }
        }
    }

