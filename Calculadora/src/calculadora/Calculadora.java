
package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int opcao = 0;
        while (opcao != 5) {
            JOptionPane.showMessageDialog(null, """
                                                [1] Somar
                                                [2] Multiplicar
                                                [3] Maior n\u00famero
                                                [4] Novo n\u00famero
                                                [5] Sair""");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual é sua opção? "));
            switch (opcao) {
                case 1 -> {
                    int soma = n1 + n2;
                    JOptionPane.showMessageDialog(null, "A soma entre " + n1 + " e " + n2 + " é " + soma);
                }
                case 2 -> {
                    int mult = n1 * n2;
                    JOptionPane.showMessageDialog(null, "A multiplicação entre " + n1 + " e " + n2 + " é " + mult);
                }
                case 3 -> {
                    if (n1 > n2) {
                        JOptionPane.showMessageDialog(null, "Entre " + n1 + " e " + n2 + ", o maior é " + n1);
                    } else if (n2 > n1) {
                        JOptionPane.showMessageDialog(null, "Entre " + n1 + " e " + n2 + ", o maior é " + n2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Os dois números são iguais!");
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Informe os números novamente");
                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
                }
                case 5 -> JOptionPane.showMessageDialog(null, "Finalizando...");
                default -> JOptionPane.showMessageDialog(null, "Erro: opção inválida! Tente novamente.");
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre!");
    }
        
}

