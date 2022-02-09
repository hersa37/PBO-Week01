/*
 *  Made for college assignments/personal projects. Do not use without permission
 */
package com.pbo1.week1;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author echa
 */
public class exercise {

static Scanner input=new Scanner(System.in);    
    
    public static void main(String[] args){
        int jumlahKegiatan=3;
        int jumlahMahasiswa=2;
             
//        System.out.println(Arrays.deepToString(twoD(jumlahKegiatan)));        
        
//        OneDimensionArray oDA= new OneDimensionArray();
//        
//        //Dua array bisa digabungkan menjadi 1 array 2D
        TwoDimensionArray tDA=new TwoDimensionArray();
        String[][] x=tDA.twoD(jumlahKegiatan, jumlahMahasiswa);
        
        System.out.println(Arrays.deepToString(x).replace("],", "]\n"));
        
    }
    
    private static void oneD(int jumlahKegiatan){
        String[] namaKegiatan=new String[jumlahKegiatan];
        int[] pointKegiatan=new int[jumlahKegiatan];
        
        for(int i=0;i<jumlahKegiatan;i++){
            System.out.print("Nama kegiatan\t"+(i+1)+":");
            namaKegiatan[i]=input.next();
            System.out.print("Point kegiatan\t"+(i+1)+":");
            pointKegiatan[i]=input.nextInt();
        }
        
        System.out.println(Arrays.deepToString(namaKegiatan));
        System.out.println(Arrays.toString(pointKegiatan));
    }
    
    private static String[][] twoD(int jumlahKegiatan){
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
