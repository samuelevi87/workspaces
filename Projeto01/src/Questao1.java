import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um " +
				"número."));
		int n1 = num -1; 
		int n2 = num +1;
		
		
		JOptionPane.showMessageDialog(null, "Os vizinhos são "+n1+" e "+n2);
		
		

	}

}
