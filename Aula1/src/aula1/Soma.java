/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import javax.swing.JOptionPane;

public class Soma {
    
        public static void main(String[] args) {
            int a, b, c;
            
            a = Integer.parseInt
                (JOptionPane.showInputDialog("Digite um número:"));
        
            b = Integer.parseInt
                (JOptionPane.showInputDialog("Digite outro número:"));
            
            c = a + b;
            
            JOptionPane.showMessageDialog(null, "O resultado da soma foi: " + c);
        
        }
}
