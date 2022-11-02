package content_6;
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;
public class C06Ex08 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("unused")
		double imc, pesoMin, pesoMax, pesoKg = 0;
		
		String nome = JOptionPane.showInputDialog(null,
				"Informe o seu nome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String alturaMetrosStr = JOptionPane.showInputDialog(null,
				"Informe a sua altura em metros: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double alturaMetros = Double.valueOf(alturaMetrosStr);
		
		imc = (pesoKg/ Math.pow(alturaMetros, 2));
		
		pesoMin = 20 * Math.pow(alturaMetros, 2);
		pesoMax = 25 * Math.pow(alturaMetros, 2);
		
		// SAÍDA DE DADOS 
		JOptionPane.showMessageDialog(null,
				"Nome: "+nome+"\nPeso mínimo com o IMC ideal: "+pesoMin+"\nPeso máximo com o IMC ideal: "+pesoMax,
 				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
	}

}

