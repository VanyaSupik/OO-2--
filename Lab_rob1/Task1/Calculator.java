package Lab_rob1.Task1;

public class Calculator {
    void calc() {
        try {
            System.out.println((2 + 2) / 0);
        } catch (ArithmeticException a) {
            System.out.println("Помилка: " + a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void calc2() {
        try {
            int i = 5;
            i /= 0;
            System.out.println("Нема помилок: ");
        }catch (ArithmeticException f){
            System.out.println("Ні, помилка є: "+ f);
        }finally {
            System.out.println("Компіляція відбудеться:");
        }
    }
    void calc3(){
        try {
            int k = 10/0;
            try {
                int[] b = new int[10];
                b[11] = 5;
            }catch (IndexOutOfBoundsException e){
                System.out.println("Помилка: "+ e);
            }

        }catch (ArithmeticException e){
            System.out.println("Помилка: "+ e);
        }
    }
}
