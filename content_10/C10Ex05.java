package content_10;
import javax.swing.JOptionPane;
public class C10Ex05 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		String sexoPessoa, pesoKgStr, alturaMetrosStr;
		double pesoKg, alturaMetros, alturaMedia = 0, cont = 0, contF = 0, contM = 0, contPesoF = 0, valorSoma = 0;
		
		
		do {
			alturaMetrosStr = JOptionPane.showInputDialog(null,
					"Informe a altura em metros da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			alturaMetros = Double.valueOf(alturaMetrosStr);
			
			if (alturaMetros != 0) {
				cont++;
				
				pesoKgStr = JOptionPane.showInputDialog(null,
					"Informe o peso em kilos: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
				pesoKg = Double.valueOf(pesoKgStr);
				
				sexoPessoa = JOptionPane.showInputDialog(null,
					"Informe o sexo da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			if (sexoPessoa.equalsIgnoreCase("F")) {
					contF++;
					if (pesoKg < 60) 
						contPesoF++;
			}
			
			else {
				contM++;
				valorSoma += alturaMetros;
				alturaMedia = valorSoma/ contM;
			}
							
		}} while (alturaMetros != 0);
		
		JOptionPane.showMessageDialog(null,
				"Total de pessoas pesquisadas: "+cont+"\nQuantidade de mulheres: "+contF+"\nAltura m�dia dos homens: "+alturaMedia+"\nQuantidade de mulheres com peso inferior a 60: "+contPesoF,
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	

}
