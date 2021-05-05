package com.company;

public class Main {

    public static void main(String[] args) {
        Account SaifAccount = new Account("Saif", "Saif@email.com", "123456");//("5000-0096-4621-5782",20000,"Saifuddin Saifee", "saifeesafuddinq@gmail.com","+91-8087979520");

//        SaifAccount.setAccountNumber("5000-0096-4621-5782");
//        SaifAccount.setBalance(20000);
//        SaifAccount.setCustomerName("Saifuddin Saifee");
//        SaifAccount.setCustomerEmail("saifeesafuddinq@gmail.com");
//        SaifAccount.setCustomerPhone("91308797952");
        SaifAccount.withdrawFunds(100.55);

        //Account FredAccount = new Account("Fred","Fredishere@gmail.com","8579032494");
        //System.out.println(FredAccount.getCustomerName() +" - "+FredAccount.getCustomerEmail() +" - "+ FredAccount.getCustomerPhone());
    }
}
