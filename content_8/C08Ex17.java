package content_8;
import javax.swing.JOptionPane;
import java.lang.Math;
public class C08Ex17 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		
		double funcaoX;
	
		String somaVariavel = null;
		
		// REPETI��ES E ENTRADA DE DADOS
		
		for (int aux = 3; aux <= 12; aux++) {
		
			funcaoX = Math.sqrt(Math.pow(aux, 2) - 3);
			
			somaVariavel = + aux + " " + funcaoX + " " + "\n" + somaVariavel ;
			
			// SA�DA DE DADOS
			
			JOptionPane.showMessageDialog(null,
				"x = "+somaVariavel,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		}
		
	
		
		
		
	

}}
