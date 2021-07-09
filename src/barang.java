/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class barang {

    static String nama;
    static int hargaSatuan;
    static int jumlah;
    static int hargaTotal;
    static int diskon;
    static int hargaBayar;
    
    Scanner input = new Scanner(System.in);
    
    barang(String a, int b, int c){
        barang.nama = a;
        barang.hargaSatuan = b;
        barang.jumlah = c;
        
    }
    int hitungHargaTotal(int hargaSatuan, int jumlah){
        hargaTotal = hargaSatuan * jumlah;
        return hargaTotal;
    }
    int hitungDiskon(int hargaTotal){
        if(hargaTotal >= 100000){
            diskon = 10;
            return diskon;
        }
        if(hargaTotal < 100000 && hargaTotal > 50000){
            diskon = 5;
            return diskon;
        }
        else{
            diskon = 0;
            return diskon;
        }
        
    }
    int hitungHargaBayar(int hargaTotal, int diskon){
        hargaBayar = hargaTotal - (hargaTotal *diskon / 100);
        return hargaBayar;
    }
    
    public static void main(String[] args) {
        barang makanan = new barang("Pringles", 10000 , 10);
        hargaTotal = makanan.hitungHargaTotal(hargaSatuan, jumlah);
        diskon = makanan.hitungDiskon(hargaTotal);
        hargaBayar = makanan.hitungHargaBayar(hargaTotal, diskon);
        System.out.println(hargaTotal);
        System.out.println(diskon);
        System.out.println(hargaBayar);
        
    }
    
}
