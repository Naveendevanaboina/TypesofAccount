package com.neoteric.savingsaccounts.account;

public class AccountTest {

        public static void main(String[] args) {
                DatabaseService service = new DatabaseService();

                Customer cust1 = new Customer("CUST001", "Naveen", "9876543210");
                service.addCustomer(cust1);

                SavingsAccount sa = SavingsAccount.createAccount("SA001", 15000, "123456789012", "ABCDE1234F");
                PPFAccount ppf = new PPFAccount("PPF001", 20000);
                FixedAccount fd = new FixedAccount("FD001", 50000);

                if (sa != null) {
                        sa.setNominee("Rahul");
                        service.addAccountToCustomer("CUST001", sa);
                }
                ppf.setNominee("Priya");
                fd.setNominee("Aarav");

                service.addAccountToCustomer("CUST001", ppf);
                service.addAccountToCustomer("CUST001", fd);

                System.out.println("\n--- Displaying Customer Accounts ---");
                service.displayCustomerAccounts("CUST001");
        }
}