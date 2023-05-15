package org.example;

import java.util.Calendar;


public class Diploma extends Mahasiswa {
    private int sertifikatCount = 0;
    private int produkHki = 0;
    public Diploma(String nama, String nim, int tahun_masuk) {
        super(nama, nim, tahun_masuk);
    }
    public Diploma(String nama, String fakultas, double ipk, int jumlah_sks, int tahun_masuk, int nomer_urut) {
        super(nama, fakultas, ipk, jumlah_sks, tahun_masuk, nomer_urut);
    }
    @Override
    public void setSyaratLulus() {
        System.out.println("Isi biodata "+getNama());
        System.out.println("1. Sertifikat\n2. Produk");
        int pilihan = Helper.readInt("Pilih Syarat");
        int syaratLulus=  Helper.readInt("Jumlah");
        if (pilihan == 1){
            this.sertifikatCount+=syaratLulus;
        } else if (pilihan == 2) {
            this.produkHki+=syaratLulus;
        }else {
            System.out.println("Input tidak dikenali");
        }
    }
//    public void setSyaratLulus(String a){
//        System.out.println(a);
//    }
    @Override
    public void getLulus() {
        if (getJumlahSks() >143
                && Calendar.getInstance().get(Calendar.YEAR)-getTahun_masuk()>3.5
                &&( sertifikatCount>0||produkHki>0)){
            System.out.println(getNama()+" dinyatakan lulus");
        }else{
            System.out.println(getNama()+" belum lulus");
        }
    }
}
