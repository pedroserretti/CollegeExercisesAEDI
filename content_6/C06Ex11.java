package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex11 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		int numPontos1 = 0, numPontos2 = 0;
		
		String equipeUm = JOptionPane.showInputDialog(null,
				"Informe o nome da primeira equipe: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String equipeDois = JOptionPane.showInputDialog(null,
				"Informe o nome da segunda equipe: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String setsEquipeUmStr = JOptionPane.showInputDialog(null,
				"Informe o n�mero de vit�rias da primeira equipe: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int setsEquipeUm= Integer.valueOf(setsEquipeUmStr);
		
		String setsEquipeDoisStr = JOptionPane.showInputDialog(null,
				"Informe o n�mero de vit�rias da segunda equipe: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		// C�LCULOS
		
		int setsEquipeDois = Integer.valueOf(setsEquipeDoisStr);
		
		if (setsEquipeUm == 3 && (setsEquipeDois == 0 || setsEquipeDois == 1)) {
			numPontos1 = 3;
			numPontos2 = 0;
		}
		
		if (setsEquipeDois == 3 && (setsEquipeUm == 0 || setsEquipeUm == 1 )) {
			numPontos1 = 3;
			numPontos2 = 0;
		}
		
		if (setsEquipeUm == 3 && (setsEquipeDois == 2)) {
			numPontos1 = 2;
			numPontos2 = 1;
		}
		
		if (setsEquipeDois == 3 && (setsEquipeUm == 2)) {
			numPontos2 = 2;
			numPontos1 = 1;
		}
		
		// SA�DA DE DADOS 
		
		JOptionPane.showMessageDialog(null,
				"N�mero de pontos "+equipeUm+": "+numPontos1+"\nN�mero de pontos "+equipeDois+": "+numPontos2,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
	}

}
