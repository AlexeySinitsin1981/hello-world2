package ru.sinitsin;

public class task2 {
    public static void main (String[] args){
        int salary = 70000;
        double tax = 0.13;
        double sumTax = tax * salary;
        double salaryOnHands = salary - sumTax;


        System.out.println(salaryOnHands);
    }
}
