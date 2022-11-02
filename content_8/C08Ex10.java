package content_8;
import javax.swing.JOptionPane;
public class C08Ex10 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		double custoTotal = 0, mediaCusto, precoMaior = 0, custoParcial;
		String insumoMaior = "";
		
		String numInsumosStr = JOptionPane.showInputDialog(null,
				"Informe o n�mero de insumos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numInsumos = Integer.parseInt(numInsumosStr);
		
		// REPETI��O E ENTRADA DE DADOS
		
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
					"Informe o pre�o do insumo: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			double precoUnitario = Double.parseDouble(precoUnitarioStr);
			
			// C�LCULO DO PRE�O TOTAL
			
			custoParcial = precoUnitario * qtdInsumo;
			custoTotal += custoParcial;
			
			// CONDI��O
			
			if (aux == 1 || custoParcial > precoMaior) {
				insumoMaior = nomeInsumo;
				precoMaior = custoParcial;
			}
		}
		
		// C�LCULO DA M�DIA DO PRE�O TOTAL
		
		mediaCusto = custoTotal / numInsumos; 
		
		JOptionPane.showMessageDialog(null,
				"Custo total: "+custoTotal+"\nM�dia dos Custos Parciais: "+mediaCusto+"\nNome do Insumo de maior custo parcial: "+insumoMaior,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
