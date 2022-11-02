package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex14 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		Scanner teclado = new Scanner(System.in);
		
		String numInteiroStr = JOptionPane.showInputDialog(null,
				"Informe um n�mero inteiro de quatro d�gitos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numInteiro = Integer.valueOf(numInteiroStr);
		
		// C�LCULOS
		
		if (numInteiro <= 999) {
			JOptionPane.showMessageDialog(null,
					"N�MERO TEM QUE TER 4 D�GITOS ",
					"Resultado",
					JOptionPane.WARNING_MESSAGE);
		}
		
		else {
			num1 = numInteiro % 10;
			num2 = (numInteiro % 100)/ 10;
			num3 = (numInteiro % 1000)/ 100;
			num4 = (numInteiro % 10000)/ 1000;				
		}
		
		// SA�DA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"N�mero: "+num1+""+num2+""+num3+""+num4,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
					
	
		
	
	}

}
