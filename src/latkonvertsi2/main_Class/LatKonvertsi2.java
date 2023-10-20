/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latkonvertsi2.main_Class;

import java.text.NumberFormat;
import java.util.Locale;

import latkonvertsi2.Sub.Komik;
import latkonvertsi2.Sub.Pelajaran;

/**
 *
 * @author mariq
 */
public class LatKonvertsi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
        /*
         * Comics List
         */
        Komik doraemon = new Komik("Doraemon", 51, 2);
        Komik conan = new Komik("Conan", 23, 2);
        Komik sinchan = new Komik("Sinchan", 17, 2);

        /*
         * Education List
         */
        Pelajaran delphi = new Pelajaran("Delphi", "Algoritma", 7);
        Pelajaran vb = new Pelajaran("VB", ".Net", 7);

        // Hitung biaya sewa untuk buku
        int hariSewa = 10; // Ubah jumlah hari sewa sesuai kebutuhan
        System.out.println(
                "Biaya sewa Doraemon selama " + hariSewa + " hari: " + fornater.format(doraemon.hitungSewa(hariSewa)));
        System.out.println(
                "Biaya sewa Delphi selama " + hariSewa + " hari: " + formater.format(delphi.hitungSewa(hariSewa)));
    }

}
