package content_10;
import javax.swing.JOptionPane;
public class C10Ex04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		String nomeMaterial, precoUnitStr, qtMaterialStr;
		double precoUnit, custoParcial, custoTotal = 0, valorBdi = 0, precoFinal = 0;
		int qtMaterial, cont = 0;
		
		// ENTRADA DE DADOS (APENAS UMA VEZ)
		String taxaBdiStr = JOptionPane.showInputDialog(null,
				"Informe a taxa de BDI: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		double taxaBdi = Double.parseDouble(taxaBdiStr);
		
		// ESTRUTURA DE REPETIÇÃO
		do {
			
			nomeMaterial = JOptionPane.showInputDialog(null,
					"Informe o nome do material: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			// CONDIÇÃO E ENTRADA DE DADOS
			if (!nomeMaterial.equalsIgnoreCase("FIM")) {
				qtMaterialStr = JOptionPane.showInputDialog(null,
					"Informe a quantidade de materiais: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
				qtMaterial = Integer.parseInt(qtMaterialStr);
			
				precoUnitStr = JOptionPane.showInputDialog(null,
					"Informe o preço unitário: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
				precoUnit = Double.parseDouble(precoUnitStr);
				
				// CÁLCULOS
				custoParcial = qtMaterial * precoUnit;
				custoTotal += custoParcial;
				valorBdi = custoTotal * taxaBdi/ 100;
				precoFinal = custoTotal + valorBdi;
				cont++;
			
		}} while (!nomeMaterial.equalsIgnoreCase("FIM"));
		
		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"Custo total: "+custoTotal+"\nBDI: "+valorBdi+"\nPreço final: "+precoFinal,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
