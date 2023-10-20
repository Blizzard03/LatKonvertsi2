/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkonvertsi2.Master;

/**
 *
 * @author mariq
 */
public class Buku {

    private final String judul;
    private final String jenis;
    private final int vol;
    private final String mataKuliah;
    private final int batas;
    private final double sewa;

    public Buku(String judul, String jenis, int vol, String mataKuliah, int batas, int sewa) {
        this.judul = judul;
        this.jenis = jenis;
        this.vol = vol;
        this.mataKuliah = mataKuliah;
        this.batas = batas;
        this.sewa = sewa;
    }

    public int hitungSewa(int hari) {
        if (hari > batas) {
            return (int) (sewa * (hari - batas));
        } else {
            return 0;
        }
    }
}
