package com.neoteric.savingsaccounts.account;



    public class PPFAccount extends Account {
        public PPFAccount(String accountNumber, double balanceAmount) {
            super(accountNumber, "PPF", balanceAmount);
        }

        @Override
        protected double getInterestRate() {
            return 7.0;
        }

        @Override
        protected int getMaturityMonths() {
            return 12;
        }

        public void displayFullAccount() {
            displayAccountDetails();
            System.out.println("Interest Rate : " + calculateInterest() + "%");
            System.out.println("Maturity Date : " + getMaturityDate());
        }
    }

