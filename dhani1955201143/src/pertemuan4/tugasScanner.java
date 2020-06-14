/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author NEC
 */
public class tugasScanner {
    
    public static void main(String[] args) {
        String nama = "";
        int usia = 0;
        int rt = 0;
        int rw = 0;
        int kodepos = 0;
        int telepon = 0;
        

        //membuat scanner
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("siapa nama anda?");
        nama = inputUser.nextLine();
        
        System.out.println("Umur anda berapa");
        usia = Integer.parseInt(inputUser.nextLine());
          
            
        System.out.println("rt anda berapa");
        rt = Integer.parseInt(inputUser.nextLine());
      
        System.out.println("rw anda berapa");
        rw = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("kodepos anda berapa");
        kodepos = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("telepon anda berapa");
         telepon = Integer.parseInt(inputUser.nextLine());
        
        //output
        System.out.println("nama anda adalah " + nama);
         System.out.println("usia anda adalah " + usia);
         System.out.println("rt anda adalah " + rt);
         System.out.println("rw anda adalah " + rw);
         System.out.println("kodepos anda adalah " + kodepos);
         System.out.println("telepon anda adalah " + telepon);
    }
}
    
    

