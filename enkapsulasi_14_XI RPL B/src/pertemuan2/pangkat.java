/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import javax.swing.JOptionPane;

/**
 *
 * @author G E U S A N
 */
public class pangkat {
    private int angka;
    private int hasil;
    
    public int getAngka() {
        return angka;
    }
    
    public void setAngka(int angka) {
        this.angka = angka;
        hasil = angka * angka;
    }
    
    public int getHasil() {
        return hasil;
    }
    
    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    
    public void cetak() {
        
        String input = JOptionPane.showInputDialog(null, "Masukkan Angka","",JOptionPane.INFORMATION_MESSAGE);
        int i = Integer.parseInt(input);
        
        setAngka(i);
        
        JOptionPane.showMessageDialog(null, "Hasil dari " + angka + " adalah " + hasil);
    }
}
