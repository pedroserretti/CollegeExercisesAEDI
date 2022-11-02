package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex05 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		String result;
		
		Scanner teclado = new Scanner(System.in);
		
		String numIntStr = JOptionPane.showInputDialog(null,
				"Informe um número inteiro: ",
				"Divisão",
				JOptionPane.QUESTION_MESSAGE);
		
		int numInt = Integer.valueOf(numIntStr);
		
		//CÁLCULOS
					
		if (numInt % 5 == 0 && numInt % 7 == 0) {
			result = "Divisível por 5 e 7";
		}
		
		else {
			result = "Não é divisível";
		}

		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"O número é divisível?\n "+result,
				"Divisão",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
		
		
		
	}

}
