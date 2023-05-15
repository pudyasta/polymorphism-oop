package org.example;

import java.util.Calendar;

public  class Mahasiswa {
    private String nama,nim,fakultas;
    private double ipk=0;
    private int jumlahSks=0,tahun_masuk,nomer_urut;
    public Mahasiswa(String nama, String nim, int tahun_masuk) {
        this.nama = nama;
        this.tahun_masuk = tahun_masuk;
        this.nim = nim;
        this.fakultas = Helper.getFakultas(nim.split("/")[1]);
    }
    public Mahasiswa(String nama, String fakultas, double ipk, int jumlahSks, int tahun_masuk, int nomer_urut) {
        this.nama = nama;
        this.fakultas = fakultas;
        setIpk(ipk);
        this.jumlahSks = jumlahSks;
        this.tahun_masuk = tahun_masuk;
        this.nomer_urut = nomer_urut;
        setNim(fakultas);
    }
    private void setNim(String fakultas){
        this.nim =  tahun_masuk+"/"+Helper.getKodeFakultas(fakultas)+"/"+nomer_urut;
    }
    public  void getLulus(){
        if (getJumlahSks() >143
                && Calendar.getInstance().get(Calendar.YEAR)-getTahun_masuk()>3.5
               ) {
            System.out.println("Mahasiswa bisa dinyatakan lulus apabila memenuhi syarat tiap jenjang");
        }else{
            System.out.println("Belum lulus");
        }
    };
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        while (true) {
            if (ipk < 4 && ipk >= 0){
                this.ipk = ipk;
                break;
            }else {
                System.out.println("Invalid IPK ");
                ipk = Helper.readInt("IPK");
            }
        }
    }
    public int getJumlahSks() {
        return jumlahSks;
    }
    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }
    public int getTahun_masuk() {
        return tahun_masuk;
    }
    public void setTahun_masuk(int tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }
    public int getNomer_urut() {
        return nomer_urut;
    }
    public void setNomer_urut(int nomer_urut) {
        this.nomer_urut = nomer_urut;
    }
    public void getSyaratLulus() {
        System.out.println("Jenis Mahasiswa tidak diketahui syarat lulusnya");
    }
    public void setSyaratLulus() {
        System.out.println("Jenis Mahasiswa tidak diketahui jenisnya sehingga sistem tidak dapat melanjutkan proses");
    }
    
}
