package content_15;
import javax.swing.JOptionPane;
public class C15Ex01Executavel {
	public static void main(String[] args) {
		
		C15Ex01 cel = new C15Ex01();
		
		cel.setModelo(JOptionPane.showInputDialog(null, 
				"Digite o nome do modelo: ", 
				"Ficha Técnica", 
				JOptionPane.QUESTION_MESSAGE));
		cel.setAnoLanc(Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o ano do lançamento: ", 
				"Ficha Técnica", 
				JOptionPane.QUESTION_MESSAGE)));
		cel.setSisOper(JOptionPane.showInputDialog(null, 
				"Digite o Sistema Operacional: ", 
				"Ficha Técnica", 
				JOptionPane.QUESTION_MESSAGE));
		cel.setNumMemoria(JOptionPane.showInputDialog(null,
				"Digite o tamanho da memória: ",
				"Ficha Técnica",
				JOptionPane.QUESTION_MESSAGE));
		cel.setValor(JOptionPane.showInputDialog(null,
				"Digite o valor do celular: ",
				"Ficha Técninca",
				JOptionPane.QUESTION_MESSAGE));
		
		cel.ImprimeCelular();

	}

}
