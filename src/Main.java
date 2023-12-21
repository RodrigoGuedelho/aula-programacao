import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Variaveis
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        String operacaoMatematica = JOptionPane.showInputDialog("Digite a operação matematica:");

        // Comentario de uma única linha

        /*
        * Comentarios com mais linhas
        
        * */
        if (operacaoMatematica.equals("+") ) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 + valor2));
        }  else if  (operacaoMatematica.equals("-")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 - valor2));
        } else if  (operacaoMatematica.equals("*")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 * valor2));
        } else if  (operacaoMatematica.equals("/")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 * valor2));
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou uma operação invalida. ");
        }



    }
}