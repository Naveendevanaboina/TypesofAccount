package com.neoteric.savingsaccounts.account;




    public class SavingsAccount extends Account {
        private String aadhaar;
        private String pan;

        private SavingsAccount(String accountNumber, double balanceAmount, String aadhaar, String pan) {
            super(accountNumber, "Savings", balanceAmount);
            this.aadhaar = aadhaar;
            this.pan = pan;
        }

        private static boolean verifyDocuments(String aadhaar, String pan) {
            return aadhaar != null && !aadhaar.isEmpty() && pan != null && !pan.isEmpty();
        }

        public static SavingsAccount createAccount(String accountNumber,
                                                   double balanceAmount, String aadhaar, String pan) {
            if (verifyDocuments(aadhaar, pan)) {
                System.out.println(" Aadhaar and PAN verified. Creating Savings Account...");
                return new SavingsAccount(accountNumber, balanceAmount, aadhaar, pan);
            } else {
                System.out.println(" Aadhaar or PAN missing! Cannot create Savings Account.");
                return null;
            }
        }

        @Override
        protected double getInterestRate() {
            return 2.7;
        }

        @Override
        protected int getMaturityMonths() {
            return 3;
        }

        public void displayFullAccount() {
            displayAccountDetails();
            System.out.println("Interest Rate : " + calculateInterest() + "%");
            System.out.println("Maturity Date : " + getMaturityDate());
        }
    }
