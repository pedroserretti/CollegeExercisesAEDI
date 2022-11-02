package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
public class C06Ex06 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS

		Scanner teclado = new Scanner(System.in);
		
		String result;
		
		double raiz1, raiz2;
		
		int delta;
		
		String valueAStr = JOptionPane.showInputDialog(null,
				"Informe o valor de A: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int valueA = Integer.valueOf(valueAStr);
		
		String valueBStr = JOptionPane.showInputDialog(null,
				"Informe o valor de B: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int valueB = Integer.valueOf(valueBStr);
		
		String valueCStr = JOptionPane.showInputDialog(null,
				"Informe o valor de C: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int valueC = Integer.valueOf(valueCStr);
		
		// C�LCULOS 
		
		delta = (int) Math.pow(valueB, 2) - 4 * valueA * valueC;
		
		raiz1 = (-valueB + Math.sqrt(delta))/ (2 * valueA);
		
		raiz2 = (-valueB - Math.sqrt(delta))/ (2 * valueA);
		
		if (delta > 0) {
			result = "Possui 2 ra�zes reais, "+raiz1+ " e "+raiz2;
		}
		
		else if (delta == 0) {
			result = "Possui apenas uma raiz, "+raiz1;
		}
		
		else {
			result = "N�o possui ra�zes reais";
		}
		
		// SA�DA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Ra�zes: "+result,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
		teclado.close();
		
		
		
		
		
		
	}
}
