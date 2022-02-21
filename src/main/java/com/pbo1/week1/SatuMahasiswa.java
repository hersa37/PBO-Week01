/*
 *  Made for college assignments/personal projects. 
 *  Do not use without permission
 */
package com.pbo1.week1;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Bernardus Hersa Galih Prakoso - 215314018
 * Universitas Sanata Dharma - Informatika
 */
public class SatuMahasiswa {

static Scanner input=new Scanner(System.in);    
    
    public static void main(String[] args){
        String[] namaKegiatan=new String[5];
        int[] pointKegiatan=new int[5];
        
        System.out.println("Mahasiswa 1");
        
        for(int i=0;i<5;i++){
            System.out.print("Nama kegiatan\t"+(i+1)+":");
            namaKegiatan[i]=input.next();
            System.out.print("Point kegiatan\t"+(i+1)+":");
            pointKegiatan[i]=input.nextInt();
        }
        
        System.out.println(Arrays.deepToString(namaKegiatan));
        System.out.println(Arrays.toString(pointKegiatan));
    }
}
//        String[] namaKegiatan2=new String[5];
//        int[] pointKegiatan2=new int[5];
//        
//        System.out.println("Mahasiswa 2");
//        
//        for(int i=0;i<5;i++){
//            System.out.print("Nama kegiatan\t"+(i+1)+":");
//            namaKegiatan2[i]=input.next();
//            System.out.print("Point kegiatan\t"+(i+1)+":");
//            pointKegiatan2[i]=input.nextInt();
//        }
//        
//        System.out.println(Arrays.deepToString(namaKegiatan2));
//        System.out.println(Arrays.toString(pointKegiatan2));
//    }
//}    
//    private static void oneD(int jumlahKegiatan){
//        String[] namaKegiatan=new String[jumlahKegiatan];
//        int[] pointKegiatan=new int[jumlahKegiatan];
//        
//        for(int i=0;i<jumlahKegiatan;i++){
//            System.out.print("Nama kegiatan\t"+(i+1)+":");
//            namaKegiatan[i]=input.next();
//            System.out.print("Point kegiatan\t"+(i+1)+":");
//            pointKegiatan[i]=input.nextInt();
//        }
//        
//        System.out.println(Arrays.deepToString(namaKegiatan));
//        System.out.println(Arrays.toString(pointKegiatan));
//    }
 
 
    
    
        
        

