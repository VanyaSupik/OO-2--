package Lab_rob2.Task2;

public class Main {
    public static void main(String[] args) {
        CarDemo c = new CarDemo();
        CarThread t1 = new CarThread("Car",c);
        CarThread t2 = new CarThread("Car",c);
        CarThread t3 = new CarThread("Car",c);

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
