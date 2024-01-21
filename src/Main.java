import interfaces.Payable;

import models.*;

import java.util.ArrayList;

import java.util.Collections;


public class Main {
    public static void printData(Iterable<Person> data){
        for(Payable person : data){

            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");

        }
    }
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("John", "Lennon", "Employee", 27045.78));

        persons.add(new Employee("George", "Harrison", "Employee", 50000.0));

        persons.add(new Student("Ringo", "Starr", 2.0));

        persons.add(new Student("Paul", "McCartney", 3.0));

        Collections.sort(persons);

        printData(persons);
    }

}