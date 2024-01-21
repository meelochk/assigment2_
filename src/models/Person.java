package models;

import interfaces.Payable;


public class Person implements Payable, Comparable<Person> {
    private static int id_gen;

    private final int id;

    private String name;

    private String surname;

    private String position;

    public Person(){
        this.id = ++id_gen;

        setPosition("Student");
    }

    public Person(String name, String surname){
        this();

        setName(name);

        setSurname(surname);
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    public int getId() {
        return id;
    }

    protected void setPosition(String position) {
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname();
    }

    @Override
    public int compareTo(Person o) {
        if(this.getPaymentAmount() - o.getPaymentAmount() > 0)

            return 1;

        else if(this.getPaymentAmount() - o.getPaymentAmount() == 0)

            return 0;

        else

            return -1;
    }
}
