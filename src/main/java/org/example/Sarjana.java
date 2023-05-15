package org.example;

import java.util.Calendar;

public class Sarjana extends Mahasiswa{
    private int publikasiCount =0;
    public Sarjana(String nama, String nim, int tahun_masuk) {
        super(nama, nim, tahun_masuk);
    }
    public Sarjana(String nama, String fakultas, double ipk, int jumlah_sks, int tahun_masuk, int nomer_urut) {
        super(nama,  fakultas, ipk, jumlah_sks, tahun_masuk, nomer_urut);
    }
    public int getPublikasiCount() {
        return publikasiCount;
    }
    public void setSyaratLulus() {
        int publikasiCount = Helper.readInt("Input jumlah publikasi");
        this.publikasiCount = publikasiCount;
    }

    @Override
    public void getLulus() {
        if (getJumlahSks() >143
                && Calendar.getInstance().get(Calendar.YEAR)-getTahun_masuk()>3.5
                && publikasiCount>0) {
            System.out.println(getNama()+" dinyatakan lulus");
        }else{
            System.out.println(getNama()+" belum lulus");
        }
    }
}
