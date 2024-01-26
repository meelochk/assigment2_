import interfaces.Payable;
import models.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<? extends Payable> data) {
        for (Payable person : data) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Employee("John", "Lennon", "Employee", 27045.78));
        payables.add(new Employee("George", "Harrison", "Employee", 50000.0));
        payables.add(new Student("Ringo", "Starr", 2.0));
        payables.add(new Student("Paul", "McCartney", 3.0));

        Collections.sort(payables, (p1, p2) -> Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount()));

        printData(payables);
    }
}
