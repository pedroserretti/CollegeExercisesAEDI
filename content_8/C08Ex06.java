package content_8;
import javax.swing.JOptionPane;
public class C08Ex06 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS

		String resultado = null;
		int valorSoma = 0, cont = 0;

		for (int aux = 1; aux <= 10; aux++) {
			String numInteiroStr = JOptionPane.showInputDialog(null,
					"Informe um n�mero inteiro: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);

			int numInteiro = Integer.parseInt(numInteiroStr);

			// C�LCULOS

			if (numInteiro % 2 == 0) {
				resultado = "Par";
				JOptionPane.showMessageDialog(null,
						"" + resultado,
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				resultado = "�mpar";
				JOptionPane.showMessageDialog(null,
						"" + resultado,
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);

			}

			if (numInteiro % 4 == 0) {
				valorSoma += numInteiro;

				if (numInteiro % 3 == 0)
					cont++;

			}

			// SA�DA DE DADOS

			JOptionPane.showMessageDialog(null,
					"Soma dos n�meros divis�veis por 4: " + valorSoma + "\nQuantidade de n�meros divis�veis por 3: " + cont,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
