package models;

public class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }
}
