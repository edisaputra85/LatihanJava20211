package com.mycompany.blok_finally;

public class FinallyClass {
    public static void main(String[] args) {
        String[] nama = new String[2];
        nama[0]="Adam";
        nama[1]="Hawa";
        try{
            System.out.println(nama[2]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Akses array ke indeks yang salah");
        }

        finally{
            for(String nm:nama){
                System.out.println(nm);
            }
        }
        System.out.println("Selesai");
    }
}

//skenario 1 : tidak terjadi exception
//skenario 2 : terjadi exception 
//Kesimpulan terjadi exception atau tidak perintah finally tetap dijalankan

//skenario 3: hapus catch, amati ketika tidak terjadi exception