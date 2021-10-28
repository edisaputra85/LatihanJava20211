package com.mycompany.project_enum;

enum AccountType {
    CURRENT("CU", 1.0), //instance dari AccountType yang valuenya tetap
    SAVINGS("SA", 2.0), //instance dari AccountType
    DEPOSIT("DP", 0.0); //instance dari AccountType
    private String code;
    private double rate;
    //konstruktor berfungsi menginisilisasi nilai atribut yang berasal dari instance
    private AccountType(String code, double rate){ 
    this.code = code; 
    this.rate = rate;
    }//end constructor method
    public String getCode() {
        return code;
    }//end method getCode
    public double getRate() {
       return rate;
    }//end 
}

public class Main {
    public static void main(String[] args) {
        //ketika objek dibuat menggunakan instance yg sudah ada
        AccountType account = AccountType.DEPOSIT;
        System.out.println("Type: " + account.name()
        +"\nCode: " + account.getCode()
        +"\nRate: " + account.getRate());        
    }   
}
