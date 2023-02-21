package Lab_rob1.Task2;

public class ExperienceException extends Exception {
    private int works;
    public ExperienceException(int works){
        this.works = works;
    }

    public int getWorks() {
        return works;
    }
}
