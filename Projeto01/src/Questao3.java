import javax.swing.*;

public class Questao3 {

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, " Qual a m�dia do Aluno ", " Notas ", JOptionPane.QUESTION_MESSAGE);
        String aluno = JOptionPane.showInputDialog(" Nome do Aluno ");
        double soma1 = Double.parseDouble(JOptionPane.showInputDialog(" Nota " +
                "da 1� prova "));
        double soma2 = Double.parseDouble(JOptionPane.showInputDialog(" Nota " +
                "da 2� prova "));
        double resultado = (soma1 + soma2) / 2;
        JOptionPane.showMessageDialog(null, " O Aluno " + aluno + " teve m�dia: " + resultado);

    }

}