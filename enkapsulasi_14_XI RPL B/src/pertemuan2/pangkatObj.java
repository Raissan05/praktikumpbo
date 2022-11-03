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
public class pangkatObj {
    public static void main(String[] args) {
        pangkat pk = new pangkat();
        
        JOptionPane.showMessageDialog(null,"Program Menghitung pangkat 2","",JOptionPane.INFORMATION_MESSAGE);  
        pk.cetak();
    }
}
