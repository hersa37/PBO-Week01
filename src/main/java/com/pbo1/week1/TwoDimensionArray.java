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
    
    public String[][] twoD(int jumlahKegiatan){
        String[][] kegiatan=new String[jumlahKegiatan][2];
        
        for(int i=0;i<jumlahKegiatan;i++){
            System.out.print("Nama kegiatan\t"+(i+1)+":");
            kegiatan[i][0]=input.next();
            System.out.print("Point kegiatan\t"+(i+1)+":");
            kegiatan[i][1]=input.next();
        }
        return kegiatan;
    }
}
