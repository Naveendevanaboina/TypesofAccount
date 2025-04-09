package com.neoteric.savingsaccounts.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseService {
    private Map<String, Customer> customerMap = new HashMap<>();
    private Map<String, List<Account>> accountMap = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerMap.put(customer.getCustomerId(), customer);
        accountMap.put(customer.getCustomerId(), new ArrayList<>());
    }

    public void addAccountToCustomer(String customerId, Account account) {
        if (accountMap.containsKey(customerId)) {
            accountMap.get(customerId).add(account);
            System.out.println("Account added to customer: " + customerId);
        } else {
            System.out.println("Customer not found with ID: " + customerId);
        }
    }

    public void displayCustomerAccounts(String customerId) {
        Customer customer = customerMap.get(customerId);
        if (customer != null) {
            customer.displayCustomerInfo();
            List<Account> accounts = accountMap.get(customerId);
            if (accounts.isEmpty()) {
                System.out.println("No accounts found for this customer.");
            } else {
                System.out.println("\nAccounts:");
                for (Account acc : accounts) {
                    if (acc instanceof SavingsAccount sa) {
                        sa.displayFullAccount();
                    } else if (acc instanceof PPFAccount ppf) {
                        ppf.displayFullAccount();
                    } else if (acc instanceof FixedAccount fd) {
                        fd.displayFullAccount();
                    }
                    System.out.println("-----------------------");
                }
            }
        } else {
            System.out.println("Customer with ID " + customerId + " not found.");
        }
    }
}
