package content_8;
import javax.swing.JOptionPane;
public class C08Ex16 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		double valorSoma = 0, cont = 0, valorMedia;
		
		for (int aux= 1000; aux<=2000; aux++) {
			
			if (aux % 2 != 0 ) {
				valorSoma+= aux;
				cont++;
			}
		}		
		
		valorMedia = valorSoma / cont;
		
		// SA�DA DE DADOS 
		
		JOptionPane.showMessageDialog(null,
			"A m�dia dos n�meros �mpares �: " +valorMedia,
			"Dados",
			JOptionPane.INFORMATION_MESSAGE);
				
		
	}

}
