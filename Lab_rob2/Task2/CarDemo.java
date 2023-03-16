package Lab_rob2.Task2;

public class CarDemo {
    void car(){
        try {
            System.out.println("Клієнт прийшов в автосалон");
            Thread.sleep(2000);
            System.out.println("Клієнт купив автомобіль");
            Thread.sleep(2000);
            System.out.println("Клієнт задоволений");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
