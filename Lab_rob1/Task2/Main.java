package Lab_rob1.Task2;

public class Main {
    public static void main(String[] args) {
        Seller s = new Seller();
        s.showSalary();
        try {
            System.out.println("Зарплата продавця залежить від його досвіду роботи: ");
            s.addSalary(2);
        }catch (ExperienceException e){
            System.out.println("Продавцю не вистачило "+ e.getWorks() + " роботи!!!");
        }
    }
}
