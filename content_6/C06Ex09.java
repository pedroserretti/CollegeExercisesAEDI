package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class C06Ex09 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		double pesoIdeal = 0;
		String pesoIdealFormat, genMas = "M", genFem = "F";
		
		String altMetrosStr = JOptionPane.showInputDialog(null,
				"Informe a altura em metros: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String genStr = JOptionPane.showInputDialog(null,
				"Informe o g�nero da pessoa: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
				
		
		double altMetros = Double.valueOf(altMetrosStr);
		
		// C�LCULOS
		
		if (genStr.equals(genMas)) {
			pesoIdeal = 72.7 * altMetros - 58;	
		}
		
		else if (genStr.equals(genFem)) {
			pesoIdeal = 62.1 * altMetros - 44.7;
		}
		
		else {
			JOptionPane.showMessageDialog(null,
					"C�digo inv�lido, n�o foi poss�vel identificar o g�nero",
					"Erro",
					JOptionPane.WARNING_MESSAGE);
		}
		
		pesoIdealFormat = new DecimalFormat ("#,##0.000").format(pesoIdeal);
		
		// SA�DA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Peso ideal: "+pesoIdealFormat,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
	}

}
