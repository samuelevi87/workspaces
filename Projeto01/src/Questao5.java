import javax.swing.*;
import java.text.DecimalFormat;

public class Questao5 {

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, " Hora do faz-me-rir! ", " Folha " +
                "de Pagamento ", JOptionPane.QUESTION_MESSAGE);
        String funcionario = JOptionPane.showInputDialog(" Nome do Funcionário ");
        double totalHoras = Double.parseDouble(JOptionPane.showInputDialog(" Horas Trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(" Valor da Hora Trabalhada: "));
        double totalSalario = totalHoras * valorHora;

        JOptionPane.showMessageDialog(null,
                " O funcionário: " + funcionario + " irá receber: R$ " + String.format("%.2f",totalSalario) +
                        " de salário ");
    }
}



