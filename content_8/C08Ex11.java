package content_8;
import javax.swing.JOptionPane;
public class C08Ex11 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS 
		
		String[] botoes1 = {"M", "F"}, botoes2 = {"C", "S", "O"}, botoes3 = {"L", "P", "C", "R"}, botoes4 = {"A", "C", "P", "O"}, botoes5 = {"1", "2", "3", "4"};
		
		int sexoPessoa, escolaridade, estadoCivil, corCabelos, corOlhos, salarioMaior = 0, cont = 0, salarioMenor = 0;
		
		double salarioDif = 0;
		
		String nomeMaior = null;
		
		// REPETIÇÃO E ENTRADA DE DADOS
		
		for (int aux = 1; aux <=3; aux++) {
			
			String nomePessoa = JOptionPane.showInputDialog(null,
					"Informe o nome da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			String idadePessoaStr = JOptionPane.showInputDialog(null,
					"Informe a idade da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int idadePessoa = Integer.valueOf(idadePessoaStr);
			
			String salarioPessoaStr = JOptionPane.showInputDialog(null,
					"Informe o salário da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int salarioPessoa = Integer.valueOf(salarioPessoaStr);
			
			sexoPessoa = JOptionPane.showOptionDialog(null,
					"Selecione o sexo da pessoa: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE,
					JOptionPane.QUESTION_MESSAGE,
					null,
					botoes1,
					"F");
			
			estadoCivil = JOptionPane.showOptionDialog(null,
					"Selecione o estado civil: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE,
					JOptionPane.QUESTION_MESSAGE,
					null,
					botoes2,
					"S");
			
			corCabelos = JOptionPane.showOptionDialog(null,
					"Selecione a cor dos cabelos: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE,
					JOptionPane.QUESTION_MESSAGE,
					null,
					botoes3,
					"L");
			
			corOlhos = JOptionPane.showOptionDialog(null,
					"Selecione a cor dos olhos: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE,
					JOptionPane.QUESTION_MESSAGE,
					null,
					botoes4,
					"A");
			
			escolaridade = JOptionPane.showOptionDialog(null,
					"Selecione a escolaridade da pessoa: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE,
					JOptionPane.QUESTION_MESSAGE,
					null,
					botoes5,
					"4");
			
			// CONDIÇÕES
			
			if (aux == 1 || salarioPessoa > salarioMaior) {
				salarioMaior = salarioPessoa;
				nomeMaior = nomePessoa;
			}
					
			if (sexoPessoa == 1) {
				if (idadePessoa >= 18 || idadePessoa <= 25);
					if (estadoCivil == 1);
						if (salarioPessoa > 10000 && escolaridade == 3);
							if (corCabelos == 0 && corOlhos == 0);
							cont++;
			}
			
			if (sexoPessoa == 0) {
				if (aux == 1 || salarioPessoa > salarioMaior && salarioPessoa < salarioMenor)
					salarioMaior = salarioPessoa;
					salarioMenor = salarioPessoa;
					salarioDif = salarioMaior - salarioMenor;
			}
		}
		
		// SAÍDA DE DADOS
	
		JOptionPane.showMessageDialog(null,
				"Mulheres do tipo informado: "+cont+"\nNome da pessoa com maior salário: "+nomeMaior+"\nDiferença do maior e menor salário de homens: "+salarioDif,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);

}}
