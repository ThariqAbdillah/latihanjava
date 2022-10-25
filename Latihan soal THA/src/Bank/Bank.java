/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
     public void getSaldo (){
        System.out.println("Sisa saldo saat ini : Rp." +saldo);
    }

    
    public void simpanUang(int Jumlah){
        saldo += Jumlah;
        System.out.println("Simpan uang: Rp." +Jumlah);
        getSaldo();
    }
   public void ambilUang (int Jumlah){
        saldo = Jumlah;
        System.out.println("Ambil uang: Rp." +Jumlah);
        
    }
    
    

    
    
}
