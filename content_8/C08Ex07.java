package content_8;
import javax.swing.JOptionPane;
public class C08Ex07 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		int cont1 = 0, cont2 = 0, cont3 = 0;
		double valorMedia, valorSoma = 0;
		
		for (int aux = 1; aux <=5; aux++) {
			String nomeAluno = JOptionPane.showInputDialog(null,
					"Informe o nome do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			String idadeAlunoStr = JOptionPane.showInputDialog(null,
					"Informe a idade do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int idadeAluno = Integer.parseInt(idadeAlunoStr);
			
			// C�LCULOS
			
				if (idadeAluno <= 12) {
					cont1++;
				}
			
				else if (idadeAluno > 30) {
					cont2++;
				}
				
				if (idadeAluno > 0) {
					valorSoma += idadeAluno;
					cont3++;
				}
			
			JOptionPane.showMessageDialog(null,
					"Nome: "+nomeAluno+"\nIdade: "+idadeAluno,
					"Dados",
					JOptionPane.INFORMATION_MESSAGE);
			
			}	
		
			valorMedia = valorSoma / cont3;
			
			// SA�DA DE DADOS
			
			JOptionPane.showMessageDialog(null,
					"Alunos que tem at� 12: "+cont1+"\nAlunos que tem acima de 30: "+cont2+"\nM�dia das idades informadas: "+valorMedia,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	
		
		


}}

