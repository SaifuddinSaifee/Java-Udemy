package com.company;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        this("5000-0096-4621-5782",0,"Default Name", "Default email","+91-8087979520");
        System.out.println("Constructor Process");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("90000", 100.55, customerName, customerEmail, customerPhone);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds (double dfunds){
        this.balance += dfunds;
        System.out.println("Deposit of " + dfunds + " has been processed. Current Balance : ");
    }

    public void withdrawFunds (double wfunds){
        if (this.balance - wfunds < 0){
            System.out.println("Only "+ this.balance + " available, withdrawal not processed.");
        } else {
            this.balance -= wfunds;
            System.out.println("Withdrawal of "+ wfunds + " processed. Remaining Balance = "+ this.balance);
        }

    }
}
