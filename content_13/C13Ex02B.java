package content_13;
import javax.swing.JOptionPane;
public class C13Ex02B {
	public static void main(String[] args) {

		int valorX;
		
		do {
			
			String valorXStr = JOptionPane.showInputDialog(null,
					"Informe o valor de X: (Digite -1 para finalizar o programa)",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			valorX = Integer.parseInt(valorXStr);
			
			if (valorX != -1) {
				JOptionPane.showMessageDialog(null,
						"F(x): " + C13Ex02.funcaoX(valorX),
						"Resultado Final",
						JOptionPane.INFORMATION_MESSAGE);
		
			}} while (valorX != -1);
		

}}
