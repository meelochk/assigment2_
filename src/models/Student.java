package models;


public class Student extends Person {
    private double gpa;

    private static double stipend = 36660;

    public Student(){
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);

        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount(){
        if(getGpa() > 2.67)

            return getStipend();

        else

            return 0;
    }

    public static void setStipend(double stipend) {
        Student.stipend = stipend;
    }

    public static double getStipend() {
        return stipend;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }
}
