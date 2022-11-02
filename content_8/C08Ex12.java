package content_8;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class C08Ex12 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, precoUnit1, precoUnit2, precoUnit3, precoUnit4, precoUnit5;
		
		double numFatura;
		
		// REPETIÇÕES E ENTRADA DE DADOS
		
		for (int aux = 1; aux <= 5; aux++) {
			
			String numCodigoStr = JOptionPane.showInputDialog(null,
					"Informe o código do produto: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int numCodigo = Integer.valueOf(numCodigoStr);
			
			if (numCodigo == 1) {
				cont1++;
			}
			
			else if (numCodigo == 2) {
				cont2++;
			}
			
			else if (numCodigo == 3) {
				cont3++;
			}
			
			else if (numCodigo == 4) {
				cont4++;
			}
			
			else if (numCodigo == 5) {
				cont5++;
			}
		}
		
		precoUnit1 = 1565;
		precoUnit2 = 1890;
		precoUnit3 = 2150;
		precoUnit4 = 2963;
		precoUnit5 = 3750;
		
		numFatura = (cont1 * precoUnit1) + (cont2 * precoUnit2) + (cont3 * precoUnit3) + (cont4 * precoUnit4) + (cont5 + precoUnit5);
		
		String numFaturaFormat = new DecimalFormat("R$#,##0.00").format(numFatura);
		
		JOptionPane.showMessageDialog(null,
				"Faturamento: "+numFaturaFormat,
				"Resultados",
				JOptionPane.INFORMATION_MESSAGE);

}}
