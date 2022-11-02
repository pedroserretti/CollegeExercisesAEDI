package content_6;
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;
public class C06Ex08 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
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
		
		// SA�DA DE DADOS 
		JOptionPane.showMessageDialog(null,
				"Nome: "+nome+"\nPeso m�nimo com o IMC ideal: "+pesoMin+"\nPeso m�ximo com o IMC ideal: "+pesoMax,
 				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
	}

}

