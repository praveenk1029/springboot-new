package com.gpk.springbootnew.domain;

import java.util.Objects;

public class Customer {
    private long customerId;
    private String name;
    private int age;
    private String city;

    public Customer(long customerId, String name, int age, String city) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Customer() {
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && age == customer.age && name.equals(customer.name) && city.equals(customer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, age, city);
    }
}
