/*
 *  Made for college assignments/personal projects. Do not use without permission
 */
package com.pbo1.week1;

/**
 *
 * @author echa
 */

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionArray {
    
    Scanner input=new Scanner(System.in);
    
    public void oneD(int jumlahKegiatan){
        String[] namaKegiatan=new String[jumlahKegiatan];
        String[] pointKegiatan=new String[jumlahKegiatan];
        
        for(int i=0;i<jumlahKegiatan;i++){
            System.out.print("Nama kegiatan\t"+(i+1)+":");
            namaKegiatan[i]=input.next();
            System.out.print("Point kegiatan\t"+(i+1)+":");
            pointKegiatan[i]=input.next();
        }
        
        System.out.println(Arrays.deepToString(namaKegiatan));
        System.out.println(Arrays.deepToString(pointKegiatan));
    }
}
