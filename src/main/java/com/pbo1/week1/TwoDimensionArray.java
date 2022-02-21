/*
 *  Made for college assignments/personal projects. Do not use without permission
 */
package com.pbo1.week1;

/**
 *
 * @author echa
 */

import java.util.Scanner;

public class TwoDimensionArray {
    
    Scanner input=new Scanner(System.in);
    
    public String[][] twoD(int jumlahKegiatan,int jumlahMahasiswa){
        String[][] kegiatan=new String[jumlahKegiatan*jumlahMahasiswa][3];
        
        for(int i=0;i<jumlahMahasiswa;i++){
            System.out.println("Mahasiswa:");
            String nama=input.next();
            int x=1;
            for(int j=0+(i*jumlahKegiatan);j<jumlahKegiatan+(i*jumlahKegiatan);j++){
                
                kegiatan[j]=nama;
                System.out.print("Nama kegiatan\t"+(x)+":");
                kegiatan[j]=input.next();
                System.out.print("Point kegiatan\t"+(x++)+":");
                kegiatan[j]=input.next();
            }
            
        }
        return kegiatan;
    }
}
