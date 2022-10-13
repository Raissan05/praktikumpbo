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
public class bangunDatarObj {
    public static void main(String[] args) {
        bangunDatar s1 = new bangunDatar();
        
        JOptionPane.showMessageDialog(null, "Program Menhitung luas bangun datar", "Luas Bangun datar", JOptionPane.INFORMATION_MESSAGE);
        String input = JOptionPane.showInputDialog(null,"1.Persegi\n2.Persegi Panjang\n3.Segitiga","PILIH BANGUN DATAR", JOptionPane.INFORMATION_MESSAGE);
        int i = Integer.parseInt(input);
        
        if(i == 1) {
            s1.luasPersegi();
        } else if(i == 2) {
            s1.luasPersegiPanjang();
        } else if(i == 3) {
            s1.luasSegitiga();
        }
    }
}
