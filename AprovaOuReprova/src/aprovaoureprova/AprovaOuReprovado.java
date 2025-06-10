
package aprovaoureprova;
import javax.swing.JOptionPane;

public class AprovaOuReprovado {

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado! Nota: " + nota);
        } else if (nota >= 5 && nota < 7) {
            JOptionPane.showMessageDialog(null, "Em recuperação. Nota: " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado. Nota: " + nota);
        }
    }
}
