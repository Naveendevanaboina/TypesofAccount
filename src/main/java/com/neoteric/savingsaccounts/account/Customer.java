package com.neoteric.savingsaccounts.account;

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;

    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
        System.out.println("Phone Number  : " + phoneNumber);
    }
}

