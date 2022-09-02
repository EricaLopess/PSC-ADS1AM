
package aula1;

import javax.swing.JOptionPane;

public class Aula1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int numero;
        
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        numero = Integer.parseInt
        (JOptionPane.showInputDialog("Digite sua idade"));
        
        JOptionPane.showMessageDialog(null, nome + " " + numero);

    }
    
}
