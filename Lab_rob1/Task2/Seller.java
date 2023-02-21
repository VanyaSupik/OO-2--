package Lab_rob1.Task2;

public class Seller {
    private int salary = 12000;
    public void showSalary(){
        System.out.println("Зарплата: "+ salary);
    }
    public void addSalary(int w) throws ExperienceException{
        if(w >= 2){
            salary += 1000;
            System.out.println("Зарплата продавця змінилася: "+ salary);
        }else {
            int n = 2;
            throw new ExperienceException(n);
        }
    }

    public int getSalary() {
        return salary;
    }
}
