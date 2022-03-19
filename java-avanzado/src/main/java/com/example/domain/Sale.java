package com.example.domain;

public class Sale {

    private final Customer customer;
    private final int year;
    private final int value;
    private String referenceCode;

    public Sale(Customer customer, int year, int value) {
        this.customer = customer;
        this.year = year;
        this.value = value;
    }

    public Sale(Customer customer, int year, int value, String referenceCode) {
        this.customer = customer;
        this.year = year;
        this.value = value;
        this.referenceCode = referenceCode;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    @Override
    public String toString() {
        return "Sale{" +
                ", year=" + year +
                ", value=" + value +
                ", referenceCode='" + referenceCode + '\'' +
                '}';
    }
}
