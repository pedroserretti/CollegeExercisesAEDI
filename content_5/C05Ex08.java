package content_5;
import java.lang.Math;
import javax.swing.JOptionPane;
public class C05Ex08 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS 
		double raio;
		
		String areaStr = JOptionPane.showInputDialog(null,
				"Informe o valor da área do setor circular:",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		double area = Integer.valueOf(areaStr).doubleValue();
		
		String anguloAStr = JOptionPane.showInputDialog(null,
				"Informe o valor do ângulo:",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		float anguloA = Integer.valueOf(anguloAStr).floatValue();
	
		//CALCULO DO RAIO
		raio = Math.sqrt((360.0 * area) / (3.1416 * anguloA));
		
		//SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"S: "+raio,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
				
		
		
		
		
		
		
		
		
		
		
	}

}
