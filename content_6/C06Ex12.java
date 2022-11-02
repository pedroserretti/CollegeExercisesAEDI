package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class C06Ex12 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		double custoTotal, custEmbalagem, custEstocagem, alugResultado;
		int numGalpoes, bolasResult, numCaixas;
		String custoTotalFormat;
		
		String prodBolasStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de bolas produzidas: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int prodBolas = Integer.valueOf(prodBolasStr);
		
		String bolasDefeitoStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de bolas com defeito: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int bolasDefeito = Integer.valueOf(bolasDefeitoStr);
		
		String valorCaixasStr = JOptionPane.showInputDialog(null,
				"Informe o preço da unidade das caixas de papelão: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double valorCaixas = Double.valueOf(valorCaixasStr);
		
		String alugMensalStr = JOptionPane.showInputDialog(null,
				"Informe o valor do aluguel mensal: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double alugMensal = Double.valueOf(alugMensalStr);
		
		String mesesCopaStr = JOptionPane.showInputDialog(null,
				"Informe quantos meses faltam para a copa: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int mesesCopa = Integer.valueOf(mesesCopaStr);
		
		// CÁLCULOS
		
		alugResultado = alugMensal * mesesCopa;
		bolasResult = prodBolas - bolasDefeito;		
		
		if (bolasResult % 10 != 0) {
			numCaixas = (bolasResult/ 10) + 1;
		} 
		
		else {
			numCaixas = bolasResult/ 10;
		}
		
		if (numCaixas % 850 != 0) {
			numGalpoes = (numCaixas/ 850) + 1;
		}
		
		else numGalpoes = numCaixas/ 850;
		
		custEmbalagem = numCaixas * valorCaixas;
		custEstocagem = alugResultado * numGalpoes;
		custoTotal = custEmbalagem + custEstocagem;
		
		
		custoTotalFormat = new DecimalFormat ("R$#,###.00").format(custoTotal);
				
		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Custo total: "+custoTotalFormat,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
	}

}
