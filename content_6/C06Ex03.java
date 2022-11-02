package content_6;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class C06Ex03 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		double salario, comissao;
		Scanner teclado = new Scanner(System.in);
		
		String vendaMensalStr = JOptionPane.showInputDialog(null,
				"Informe o valor vendido mensal: ",
				"Vendas",
				JOptionPane.QUESTION_MESSAGE);
		
		double vendaMensal = Double.valueOf(vendaMensalStr);
		
		String valueFixStr = JOptionPane.showInputDialog(null,
				"Informe o valor fixo: ",
				"Vendas",
				JOptionPane.QUESTION_MESSAGE);
		
		double valueFix = Double.valueOf(valueFixStr);
		
		//CÁLCULO
		if (vendaMensal <= 1000) {
			comissao = 0;
			
		}
		else if (vendaMensal > 1000 && vendaMensal <= 10000) {
			comissao = vendaMensal * 0.1;
			
		}
		else {
			salario = vendaMensal + 240 + 1000;
			comissao = 1000;
		}
		
		salario = valueFix + comissao;
		
		//SAÍDA DE DADOS 
		System.out.println("Salário: R$"+salario);	
		teclado.close();
		
		
		
		
		
		
		
		
	}

}
