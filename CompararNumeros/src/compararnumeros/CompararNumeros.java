
package compararnumeros;

import javax.swing.JOptionPane;

public class CompararNumeros {

    public static void main(String[] args) {
         int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
        }
    }
}