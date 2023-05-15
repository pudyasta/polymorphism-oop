package org.example;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException
    {
        SistemInformasi newSys = new SistemInformasi();
        SistemInformasiView informasiView = new SistemInformasiView(newSys);
        informasiView.siaView();
//        Diploma a = new Diploma("Budi","Vokasi",1,123,2018,150);
//        a.setSyaratLulus("Lulus");
    }
}
