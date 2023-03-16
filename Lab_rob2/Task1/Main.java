package Lab_rob2.Task1;

public class Main {
    public static void main(String[] args) {
        String s1 = "Фольцваген";
        String s2 = "БМВ";
        String s3 = "Рено";

        Threads t1 = new Threads(s1);
        Threads t2 = new Threads(s2);
        Threads t3 = new Threads(s3);

        try {
            System.out.println("Головний потік очікує завершення роботи дочірніх потоків");
            t1.t.join(); // очікування завершення першого дочірнього потоку
            t2.t.join(); // очікування завершення другого дочірнього потоку
            t3.t.join(); // очікування завершення трерього дочірнього потоку
        } catch (InterruptedException e) {
            System.out.println("Головний потік перервано");
        }
        System.out.println("Головний потік завершено");
    }
}

