import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class Questao2 {

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, " Vamos somar! ", " Soma ",
                JOptionPane.QUESTION_MESSAGE);
        double soma1 =
                Double.parseDouble(JOptionPane.showInputDialog("Insira um " +
                        "numero "));
        double soma2 = Double.parseDouble(JOptionPane.showInputDialog(" " +
                "Insira outro numero"));
        double resultado = soma1 + soma2;
        JOptionPane.showMessageDialog(null, " O Resultado entre " + soma1 +
                " e " + soma2 + " eh = " + resultado);

    }

}