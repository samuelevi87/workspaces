import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um " +
				"n�mero."));
		int n1 = num -1; 
		int n2 = num +1;
		
		
		JOptionPane.showMessageDialog(null, "Os vizinhos s�o "+n1+" e "+n2);
		
		

	}

}
