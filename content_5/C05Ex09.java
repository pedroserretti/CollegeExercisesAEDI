package content_5;
import javax.swing.JOptionPane;
public class C05Ex09 {
	public static void main(String[] args) {
		
		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		double notaResultado;
		
		String notaUmStr = JOptionPane.showInputDialog(null,
				"Informe a primeira nota:",
				"Calcular Notas",
				JOptionPane.QUESTION_MESSAGE);
		double notaUm = Integer.valueOf(notaUmStr).doubleValue();
		
		String notaDoisStr = JOptionPane.showInputDialog(null,
				"Informe a segunda nota:",
				"Calcular Notas",
				JOptionPane.QUESTION_MESSAGE);
		double notaDois = Integer.valueOf(notaDoisStr).doubleValue();
		
		String notaTresStr = JOptionPane.showInputDialog(null,
				"Informe a terceira nota:",
				"Calcular Notas",
				JOptionPane.QUESTION_MESSAGE);
		double notaTres = Integer.valueOf(notaTresStr).doubleValue();
		
		//C�LCULO DE NOTAS
		notaResultado = ((2 * notaUm) + (3 * notaDois)  + (5 * notaTres))/ 10.0;
		
		//SA�DA DE DADOS
		JOptionPane.showMessageDialog(null,
				"M�dia das notas: "+notaResultado,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
