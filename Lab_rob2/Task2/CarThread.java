package Lab_rob2.Task2;

public class CarThread implements Runnable{
    Thread t;
    String name;
    CarDemo demo;

    public CarThread(String name, CarDemo demo) {
        this.name = name;
        this.demo = demo;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try {
            synchronized (demo){
                System.out.println("Клієнту потрібно автомобіль");
                demo.car();
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
