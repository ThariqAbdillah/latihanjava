/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author hp
 */
public class MatematikaCanggih {
    int tambah(int nilai1,int nilai2){
        int hasil = nilai1 + nilai2;
        return hasil;
        
    }
    int Kurang(int nilai1,int nilai2){
        int hasil = nilai1 - nilai2;
        return hasil;
    }
    int kali(int nilai1,int nilai2){
        int hasil = nilai1 * nilai2;
        return hasil;
    }
    int bagi(int nilai1,int nilai2){
        int hasil = nilai1 / nilai2;
        return hasil;
    }
    //double
    void tambah(double a, double b, double c){
        System.out.println(a + "+" +b+ " + " +c+ " = " +(a+b+c));
        
    }
     void kurang(double a, double b, double c){
        System.out.println(a + "-" +b+ " - " +c+ " = " +(a-b-c));
    
}
  void kali(double a, double b, double c){
        System.out.println(a + "*" +b+ " * " +c+ " = " +(a*b*c));
  }
         void bagi(double a, double b, double c){
        System.out.println(a + "/" +b+ " / " +c+ " = " +(a/b/c));
         }
          void modulus(double a, double b, double c){
        System.out.println(a + "%" +b+ " % " +c+ " = " +(a%b%c));
     
     
     
     
          }
}
