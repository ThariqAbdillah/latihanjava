/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import static java.lang.Integer.parseInt;



/**
 *
 * @author hp
 */
public class BankBeraksi {

    /**
     *
     */
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bnk = new Bank();
        
        System.out.println("Selamat datang di bank ABC");
        bnk.getSaldo();
        bnk.simpanUang(500000);
        bnk.ambilUang(50000);
        
        
    }
    
}
