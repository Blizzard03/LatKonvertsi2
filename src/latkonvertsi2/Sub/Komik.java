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
public class Komik extends Buku {
    public Komik(String judul, int vol, int batas) {
        super(judul, "Komik", vol, "", batas, 2000);
    }
}
