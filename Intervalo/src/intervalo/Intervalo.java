
package intervalo;

import javax.swing.JOptionPane;

public class Intervalo {
    public static void main(String[] args) {
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (numero >= 10 && numero <= 20) {
            JOptionPane.showMessageDialog(null, numero + " está DENTRO do intervalo de 10 a 20.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " está FORA do intervalo de 10 a 20.");
        }
    }
}
