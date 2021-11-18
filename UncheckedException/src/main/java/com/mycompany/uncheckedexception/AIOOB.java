
package com.mycompany.uncheckedexception;

public class AIOOB {
    public static void main(String[] args) {
        String[] namaHewan = {"Kucing","Kambing"};
        for (int i=0; i<=2;i++){
            try{
            System.out.println(namaHewan[i]);
                    }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index i ="+i+"di luar range array");
            }
        }
        System.out.println("selesai");
    }           
}
