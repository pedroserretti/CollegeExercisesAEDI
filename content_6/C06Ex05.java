package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex05 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		String result;
		
		Scanner teclado = new Scanner(System.in);
		
		String numIntStr = JOptionPane.showInputDialog(null,
				"Informe um n�mero inteiro: ",
				"Divis�o",
				JOptionPane.QUESTION_MESSAGE);
		
		int numInt = Integer.valueOf(numIntStr);
		
		//C�LCULOS
					
		if (numInt % 5 == 0 && numInt % 7 == 0) {
			result = "Divis�vel por 5 e 7";
		}
		
		else {
			result = "N�o � divis�vel";
		}

		// SA�DA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"O n�mero � divis�vel?\n "+result,
				"Divis�o",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
		
		
		
	}

}
