/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import javax.swing.JOptionPane;

/**
 *
 * @author G E U S A N
 */
public class bangunDatar {
    private int panjang;
    private int lebar;
    private int sisi;
    private int luas;
    private int alas;
    private int tinggi;
    
    
    public int getLebar() {
        return lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public void persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.luas = luas;
        
        luas = panjang * lebar;
    }
    
    public void segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        
        luas = (alas * tinggi) / 2;
    }
    
    public int getLuas() {
        return luas;
    }
    
    public void setLuas(int luas) {
        this.luas = luas;
    }
    
    public int getSisi() {
        return luas;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
        luas = sisi * sisi;
    }

    void luasPersegi() {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai Sisi: ");
        
        int nilai1 = Integer.parseInt(input1);
        
        setSisi(nilai1);
        JOptionPane.showMessageDialog(null,"Luas Persegi: " + luas , "HASIL", JOptionPane.INFORMATION_MESSAGE);   
    }
    void luasPersegiPanjang() {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai Panjang: ");
        String input2 = JOptionPane.showInputDialog("Masukkan nilai Lebar: ");
        
        int nilai1 = Integer.parseInt(input1);
        int nilai2 = Integer.parseInt(input2);
        
        persegiPanjang(nilai1, nilai2);
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang: " + luas , "HASIL", JOptionPane.INFORMATION_MESSAGE);   
    }
    void luasSegitiga() {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai Alas: ");
        String input2 = JOptionPane.showInputDialog("Masukkan nilai Tinggi: ");
        
        int nilai1 = Integer.parseInt(input1);
        int nilai2 = Integer.parseInt(input2);
        
        segitiga(nilai1, nilai2);
        JOptionPane.showMessageDialog(null,"Luas Segitiga: " + luas , "HASIL", JOptionPane.INFORMATION_MESSAGE);   
    }
    
}
