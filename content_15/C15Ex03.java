package content_15;
import javax.swing.JOptionPane;
public class C15Ex03 {
	public static void main(String[] args) {

		C15Ex02 cel02 = new C15Ex02();
		
		cel02.setModelo(JOptionPane.showInputDialog(null, 
				"Digite o nome do modelo: ", 
				"Ficha Técnica", 
				JOptionPane.QUESTION_MESSAGE));
		
		cel02.setMemRam(JOptionPane.showInputDialog(null, 
				"Digite o valor da memória ram: ", 
				"Ficha Técnica",
				JOptionPane.QUESTION_MESSAGE));
		
		cel02.setProcessador(JOptionPane.showInputDialog(null, 
				"Digite o nome do processador: ", 
				"Ficha Técnica",
				JOptionPane.QUESTION_MESSAGE));
		
		cel02.ImprimeCelular();
				
	}

}
