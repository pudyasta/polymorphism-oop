package org.example;
import java.io.IOException;
public class SistemInformasiView {
    private SistemInformasi informasi;
    public SistemInformasiView(SistemInformasi informasi) {
        this.informasi = informasi;
    }
    public void siaView () throws IOException {
        Helper.clear();
        System.out.println("Selamat Datang, Silahkan Pilih Menu" +
                "\n1. Tambah Mahasiswa" +
                "\n2. List Semua Mahasiswa" +
                "\n3. List Mahasiswa Sarjana" +
                "\n4. List Mahasiswa Diploma" +
                "\n5. Cek kelulusan"+
                "\n6. Tambah Syarat Lulus")
        ;
        int pilih = Helper.readInt("Pilih Menu (1-6)");
        switch (pilih){
            case 1:
                Helper.clear();
                informasi.addMahasiswa();
                Helper.clear();
                siaView();
                break;
            case 2:
                Helper.clear();
                informasi.getSemuaMahasiswa();
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
            case 3:
                Helper.clear();
                informasi.getMahasiswaSarjana();
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
            case 4:
                Helper.clear();
                informasi.getMahasiswaDiploma();
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
            case 5:
                Helper.clear();
                String nim = Helper.readString("Input NIM Mahasiswa");
                informasi.getLulusMahasiswa(nim);
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
            case 6:
                Helper.clear();
                String nomor = Helper.readString("Input NIM Mahasiswa");
                informasi.setSyaratLulus(nomor);
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
            default:
                System.out.println("Inputan Salah");
                Helper.pressEnterToContinue();
                Helper.clear();
                siaView();
                break;
        }
    }
}
