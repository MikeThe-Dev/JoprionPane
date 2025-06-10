
package temperatura;

import javax.swing.JOptionPane;

public class Temperatura {

    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
        double fahrenheit = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, celsius + "°C equivalem a " + fahrenheit + "°F");
    
    }
}
