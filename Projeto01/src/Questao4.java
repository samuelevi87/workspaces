import javax.swing.*;
import java.text.DecimalFormat;

public class Questao4 {


    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, " Cálculo do Total Gasto ", " " +
                "Pedido 01 ", JOptionPane.QUESTION_MESSAGE);
        String cliente = JOptionPane.showInputDialog(" Nome do Cliente ");
        double produto1 = Double.parseDouble(JOptionPane.showInputDialog(" Valor: "));
        double produto2 = Double.parseDouble(JOptionPane.showInputDialog(" Valor: "));
        double totalPedido = produto1 + produto2;
        double garcon = totalPedido * 0.1;
        DecimalFormat df = new DecimalFormat(" ###.## ");
        JOptionPane.showMessageDialog(null, " Total do pedido: " + totalPedido +
				"\n 10% do Garçon: " +  df.format(garcon));


    }
}
