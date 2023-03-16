package Lab_rob2.Task1;

public class Threads implements Runnable{
    Thread t;
    String name;

    Threads(String n) {
        name = n;
        t = new Thread(this, name);
        t.start();
    }
    @Override
    public void run() {
        try {
            if (name.equals("Фольцваген")){
                System.out.println("Він купив "+ name);
                car1();
            }else if (name.equals("БМВ")){
                System.out.println("Він купив "+ name);
                car2();
            }else if (name.equals("Рено")){
                System.out.println("Він купив "+ name);
                car3();
            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Перервано");
        }
        System.out.println(name + " Завершено");
    }
    void car1(){
        System.out.println("Фольцваген - солідна машина");
    }
    void car2(){
        System.out.println("БМВ - швидка машина");

    }
    void car3(){
        System.out.println("Рено - надійна машина");
    }
}
