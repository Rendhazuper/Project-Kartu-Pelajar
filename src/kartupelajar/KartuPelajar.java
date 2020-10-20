/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartupelajar;

import java.util.Scanner;

/**
 *
 * @author GAMES
 */
public class KartuPelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        // TODO code application logic here
       
        String Nama,TTL,Gender,Alamat,Agama,NIS;
        Scanner input = new Scanner (System.in);
        //input data data
        System.out.println("MASUKAN DATA-DATA ANDA");
        
        System.out.print("NIS :");
        NIS = input.nextLine();
        
        System.out.print("NAMA :");
        Nama = input.nextLine();
        
       
        
        System.out.print("Tempat dan Tanggal lahir :");
        TTL = input.nextLine();
        System.out.println("");
        
        
        
        System.out.print("Alamat :");
        Alamat = input.nextLine();
        
        System.out.print("Agama  :");
        Agama = input.nextLine();
        
        System.out.print("Jenis Kelamin Perempuan / Laki-Laki ?:");
        Gender = input.nextLine();
        
        
            
        
        
        
        //output 
        System.out.println("*****************************************");
        System.out.println("KARTU PELAJAR");
        System.out.println("Nama : " +Nama);
        System.out.println("NIS  : " +NIS);
        System.out.println("TTL  : " +TTL);
        System.out.println("Alamat: " +Alamat);
        System.out.println("Agama : " +Agama);
        System.out.println("Jenis Kelamin : " +Gender);
        
    }
    
    
}
