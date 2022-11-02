package content_8;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C08Ex22 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		int valorNum;
		double cont1 = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Informe um numero inteiro, maior que zero: ");
		valorNum = teclado.nextInt();
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= valorNum; aux++) {
			
			// CONDIÇÃO
			if (valorNum % aux == 0) {
				cont1++;
			}
			
			else if (cont1 >= 3) {
				break;
			}
		}
		
		// SAÍDA DE DADOS E CONDIÇÃO
		if (cont1 == 2)
			JOptionPane.showMessageDialog(null,
					"O número é primo.",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,
					"O número não é primo.",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
			
	}

}
