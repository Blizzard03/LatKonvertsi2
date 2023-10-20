/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkonvertsi2.Sub;

import latkonvertsi2.Master.Buku;

/**
 *
 * @author mariq
 */
public class Pelajaran extends Buku {
    public Pelajaran(String judul, String mataKuliah, int batas) {
        super(judul, "Pelajaran", 0, mataKuliah, batas, 1000);
    }
}
