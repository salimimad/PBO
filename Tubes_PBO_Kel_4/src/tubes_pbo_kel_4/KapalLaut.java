/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo_kel_4;

/**
 *
 * @author Giga
 */
public class KapalLaut extends Kendaraan {
    private String namaKendaraan;
    private int tarifKendaraan;
    
    public void tambahPenumpang(int jumlahPenumpang){
        jumlahPenumpang = super.getJumlahPenumpang() + 1;
    }
    public void kurangPenumpang(int jumlahPenumpang){
        jumlahPenumpang = super.getJumlahPenumpang() - 1;
    }
    public boolean cekKuota(){
        if(super.getJumlahPenumpang() < super.getMaxPenumpang()){
            return true;
        }
        else return false;
    }
}
 