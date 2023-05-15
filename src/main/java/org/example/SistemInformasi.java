package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemInformasi {
    private static List<Mahasiswa> listMahasiswa = new ArrayList<>();
    public void addMahasiswa() throws IOException {
        Helper.clear();
        System.out.println("Jenis Mahasiswa : \n1. Lama\n2. Baru");
        int jenisMahasiswa = Helper.readInt("Pilih Jenis Mahasiswa");
        Helper.clear();
        System.out.println("Jenis Jenjang : \n1. Sarjana\n2. Diploma");
        int jenjangMahasiswa = Helper.readInt("Pilih Jenjang Mahasiswa");
        Helper.clear();

        if (jenisMahasiswa == 1){
            String nama = Helper.readString("Nama");
            String fakultas = Helper.readString("Fakultas");
            int jumlahSks = Helper.readInt("Jumlah SKS");
            int tahun_masuk = Helper.readInt("Tahun Masuk");
            int nomer_urut = Helper.readInt("Nomor Urut");
            double ipk = Helper.readDouble("IPK");
            if (jenjangMahasiswa == 1){
                Mahasiswa n = new Sarjana(nama,fakultas,ipk,jumlahSks,tahun_masuk,nomer_urut);
                Helper.pressEnterToContinue();
                listMahasiswa.add(n);
            }else if (jenjangMahasiswa == 2) {
                listMahasiswa.add(new Diploma(nama,fakultas,ipk,jumlahSks,tahun_masuk,nomer_urut));
            }else{
                System.out.println("Input tidak dikenali");
            }
        } else if (jenisMahasiswa == 2) {
            String nama = Helper.readString("Nama");
            String nim = Helper.readString("NIM");
            int tahun_masuk = Helper.readInt("Tahun Masuk");
            if (jenjangMahasiswa == 1){
                listMahasiswa.add(new Sarjana(nama,nim,tahun_masuk));
            }else if (jenjangMahasiswa == 2) {
                listMahasiswa.add(new Diploma(nama,nim,tahun_masuk));
            }else{
                System.out.println("Input tidak dikenali");
            }
        }else{
            System.out.println("Input tidak dikenali");
        }
        Helper.clear();
    }
    public  void getSemuaMahasiswa() {
        for (Mahasiswa i :
                listMahasiswa) {
            System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");
        }
    }
    public  void getMahasiswaDiploma(){
        for (Mahasiswa i : listMahasiswa) {
            if (i instanceof Diploma) {
                System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");
            }
        }
    }
    public  void getMahasiswaSarjana(){
        for (Mahasiswa i : listMahasiswa) {
            if (i instanceof Sarjana) {
                System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");
            }
        }
    }
    public  void getLulusMahasiswa(String nim){
        for (Mahasiswa i : listMahasiswa) {
            if (i.getNim().equals(nim)) {
                i.getLulus();
                break;
            }
        }
    }
    public void setSyaratLulus(String nim){
        for (Mahasiswa i : listMahasiswa) {
            if (i.getNim().equals(nim)) {
                i.setSyaratLulus();
                break;
            }
        }
    }
}
