package content_6;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex07 {
	public static void main(String[] args) {

		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		double pLBruto, plLiquido, imposto;
		
		String plLiquidoFormat;
		
		String salarioStr = JOptionPane.showInputDialog(null,
				"Informe o sal�rio: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double salario = Double.parseDouble(salarioStr);
		
		//C�LCULOS
		
		if (salario <= 300) {
			pLBruto = 500 + (salario * 0.7);
		}
		
		else if (salario <= 1000) {
			pLBruto = 200 + (salario * 0.5);
		}

		else 
			pLBruto = 0 + (salario * 0.3);
		
		imposto = pLBruto * 0.25;
		
		plLiquido = pLBruto - imposto;
		
		plLiquidoFormat = new DecimalFormat("#,##0.00").format(plLiquido);
		
		// SA�DA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"PL L�quido: "+plLiquidoFormat,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
				
		
		
	}

}
