package content_8;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;
public class C08Ex13 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner arquivo = new Scanner(
				C08Ex13.class.getResourceAsStream("c08ex013.txt"));
		String nomeCidade, cidadeMenor = "";
		float percent;
		int qtPopulacao, numEleitores, qtHomens, qtMulheres, somaHM, cont1 = 0, cont2 = 0, populacaoMenor = 0;
		
		// ESTRUTURA DE REPETIÇÃO E ENTRADA DE DADOS
		for (int aux = 1; aux <= 4; aux++) {
			nomeCidade = arquivo.nextLine();
			qtPopulacao = arquivo.nextInt();
			numEleitores = arquivo.nextInt();
			qtHomens = arquivo.nextInt();
			qtMulheres = arquivo.nextInt();
			arquivo.nextLine();
			somaHM = qtHomens + qtMulheres;
			
			// CONDIÇÕES 
			if (somaHM != qtPopulacao) {
				JOptionPane.showMessageDialog(null,
						"A soma de homens e mulheres difere da população da cidade!");
			}
			percent = (float) numEleitores/ qtPopulacao * 100;
			
			// FORMATANDO VALORES PARA DECIMAL
			String percentFormat = new DecimalFormat("##0,00%").format(percent);
			JOptionPane.showMessageDialog(null,
					"Porcentagem de eleitores em relação a população da cidade: "+percentFormat);
			
			// CONDIÇÕES
			if (qtPopulacao > 1000000) {
				cont1++;
			}
			
			if (qtMulheres > qtHomens) {
				cont2++;
			}
			
			if (aux == 1 || qtPopulacao < populacaoMenor);
			cidadeMenor = nomeCidade;
			populacaoMenor = qtPopulacao;
		}
		
		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null, "Quantidade total de cidades acima de 1 milhão de habitantes: "+cont1+
				"\nQuantidade total de cidades que possui mais mulheres: "+cont2+
				"\nCidade com menos habitantes: "+cidadeMenor,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}

}
