package content_6;
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;
public class C06Ex04 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		double imc;
		String condicao;
		
		String nome = JOptionPane.showInputDialog(null,
				"Informe o seu nome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String alturaMetrosStr = JOptionPane.showInputDialog(null,
				"Informe a sua altura em metros: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double alturaMetros = Double.parseDouble(alturaMetrosStr);
		
		String pesoKgStr = JOptionPane.showInputDialog(null,
				"Informe o seu peso em kg: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double pesoKg = Double.parseDouble(pesoKgStr);
		
		imc = pesoKg/ Math.pow(alturaMetros, 2);
		
		// C�LCULO		
		
		if (imc < 18) {
			condicao = "Pessoa est� desnutrida";
		}
		
		else if (imc >= 18 && imc < 20) {
			condicao = "Pessoa est� abaixo do peso";
		}
		
		else if (imc >= 20 && imc < 25) {
			condicao = "Pessoa est� no peso ideal";
		}
		
		else if (imc > 25 && imc < 27) {
			condicao = "Pessoa est� acima do peso";
		}
		else {
			condicao = "Pessoa est� obesa";
		}
		
		// SA�DA DE DADOS 
		JOptionPane.showMessageDialog(null,
				"Nome: "+nome+"\nPeso: "+pesoKg+"\nAltura: "+alturaMetros+"\nIMC: "+condicao,
 				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
	}

}
