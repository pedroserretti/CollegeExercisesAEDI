package content_8;
import javax.swing.JOptionPane;
public class C08Ex10 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		double custoTotal = 0, mediaCusto, precoMaior = 0, custoParcial;
		String insumoMaior = "";
		
		String numInsumosStr = JOptionPane.showInputDialog(null,
				"Informe o número de insumos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numInsumos = Integer.parseInt(numInsumosStr);
		
		// REPETIÇÃO E ENTRADA DE DADOS
		
		for (int aux = 1; aux <= numInsumos; aux++) {
			
			String nomeInsumo = JOptionPane.showInputDialog(null,
					"Informe o insumo: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			
			
			String qtdInsumoStr = JOptionPane.showInputDialog(null,
					"Informe a quantidade do insumo: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int qtdInsumo = Integer.parseInt(qtdInsumoStr);
			
			String precoUnitarioStr = JOptionPane.showInputDialog(null,
					"Informe o preço do insumo: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			double precoUnitario = Double.parseDouble(precoUnitarioStr);
			
			// CÁLCULO DO PREÇO TOTAL
			
			custoParcial = precoUnitario * qtdInsumo;
			custoTotal += custoParcial;
			
			// CONDIÇÃO
			
			if (aux == 1 || custoParcial > precoMaior) {
				insumoMaior = nomeInsumo;
				precoMaior = custoParcial;
			}
		}
		
		// CÁLCULO DA MÉDIA DO PREÇO TOTAL
		
		mediaCusto = custoTotal / numInsumos; 
		
		JOptionPane.showMessageDialog(null,
				"Custo total: "+custoTotal+"\nMédia dos Custos Parciais: "+mediaCusto+"\nNome do Insumo de maior custo parcial: "+insumoMaior,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
