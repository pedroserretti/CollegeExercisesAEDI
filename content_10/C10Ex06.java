package content_10;
import javax.swing.JOptionPane;
import java.lang.Math;
public class C10Ex06 {
	public static void main(String[] args) {

		
		String valorXStr, valorYStr;
		double valorX, valorY, distancia;
		
		String valorAStr = JOptionPane.showInputDialog(null,
					"Informe o valor de A: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		int valorA = Integer.parseInt(valorAStr);
			
		String valorBStr = JOptionPane.showInputDialog(null,
					"Informe o valor de B: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		int valorB = Integer.parseInt(valorBStr);
			
		String valorCStr = JOptionPane.showInputDialog(null,
					"Informe o valor de C: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		int valorC = Integer.parseInt(valorCStr);
		
		do {
			
			valorXStr = JOptionPane.showInputDialog(null,
					"Informe o valor de X: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			valorX = Double.parseDouble(valorXStr);
			
			valorYStr = JOptionPane.showInputDialog(null,
					"Informe o valor de Y: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			valorY = Double.parseDouble(valorYStr);
			
			distancia = valorA * (valorX + valorB * valorY + valorC)/ (Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2)));
			
			if (distancia != -1) 
				JOptionPane.showMessageDialog(null,
						"Distância: "+distancia,
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			
			if (distancia == 0) {
				break;
			} 
		} while (distancia != 0);
		
		JOptionPane.showMessageDialog(null,
				"Distância: "+distancia,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
