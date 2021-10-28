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

enum Gender{
        PRIA,
        WANITA
}

enum JenisAgama{
    ISLAM,
    KRISTEN,
    KATOLIK,
    HINDU,
    BUDHA,
    KONGHUCU,
}

enum GolonganDarah{
    A,
    B,
    AB,
    O
}
    
class Biodata{
    String nama;
    int umur;
    Gender jenisKelamin;
    JenisAgama agama;
    GolonganDarah gol;
    Biodata(String nama, int umur, Gender jenisKelamin, JenisAgama agama, GolonganDarah gol){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.gol = gol;
    }
}

public class Main {
    public static void main(String[] args) {
        Biodata fulan = new Biodata("Ronaldo",34,Gender.PRIA,JenisAgama.KATOLIK,GolonganDarah.O);
        
        if (fulan.agama == JenisAgama.ISLAM) System.out.println("agama Islam");
        else if (fulan.agama == JenisAgama.KATOLIK) System.out.println("agama Katolik");
        //membaca semua nilai enum yang ada pada JenisAgama
        for (JenisAgama namaAgama: JenisAgama.values()){
            System.out.println(namaAgama.name());   
        }
        
        //ketika objek dibuat menggunakan instance yg sudah ada
        AccountType account = AccountType.DEPOSIT;
        System.out.println("Type: " + account.name()
        +"\nCode: " + account.getCode()
        +"\nRate: " + account.getRate());    
        
    }   
}

