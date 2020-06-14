/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author NEC
 */
public class tugasJoptionPane {
    public static void main(String[] args) {
       
        String tanya = JOptionPane.showInputDialog("Dimana Anda Tinggal?");
        JOptionPane.showMessageDialog(null,"saya Tinggal di" + tanya);
        
        String takon = JOptionPane.showInputDialog("kenapa Anda sedih?");
        JOptionPane.showMessageDialog(null,"anda sedih karena" + takon);
        
        String tangglet = JOptionPane.showInputDialog("dimana anda mondok?");
        JOptionPane.showMessageDialog(null,"Anda mondok di" + tangglet);
        
        String pitakon= JOptionPane.showInputDialog("apa pekerjaan anda?");
        JOptionPane.showMessageDialog(null,"Anda bekerja di" + pitakon);
        
        String narosken = JOptionPane.showInputDialog("apa yang sedang anda lakukan?");
        JOptionPane.showMessageDialog(null,"anda sedang melakukan" + narosken);
        
        
        
        
    }
 
}
