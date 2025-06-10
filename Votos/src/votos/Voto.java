
package votos;

import javax.swing.JOptionPane;

public class Voto {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:").toLowerCase();
        if (idade >= 16 && nacionalidade.equals("brasileira")) {
            JOptionPane.showMessageDialog(null, "Você PODE votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você NÃO pode votar.");
        }
    }
}