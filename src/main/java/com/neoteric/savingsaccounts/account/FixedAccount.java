package com.neoteric.savingsaccounts.account;



    public class FixedAccount extends Account {
        public FixedAccount(String accountNumber, double balanceAmount) {
            super(accountNumber, "Fixed", balanceAmount);
        }

        @Override
        protected double getInterestRate() {
            return 6.5;
        }

        @Override
        protected int getMaturityMonths() {
            return 30;
        }

        public void displayFullAccount() {
            displayAccountDetails();
            System.out.println("Interest Rate : " + calculateInterest() + "%");
            System.out.println("Maturity Date : " + getMaturityDate());
        }
    }




