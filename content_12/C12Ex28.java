package content_12;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class C12Ex28 {
	public static void main(String[] args) {
		
		List <Integer> listaRA = new ArrayList<Integer>();
		List <String> listaNomes = new ArrayList<String>();
		String tempAlunos, nomePesquisa, nomeAluno;
		int tempRA, raAluno, cont = 0;
		
		do
		{
			nomeAluno = JOptionPane.showInputDialog(null,
				"Informe o nome do aluno: (Digite X para encerrar)",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
			if (!nomeAluno.equalsIgnoreCase("X")) 
			{
			listaNomes.add(nomeAluno);
			}
				
		}
		while (!nomeAluno.equalsIgnoreCase("X"));
		
		do 
		{
			
			raAluno = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Informe o RA do aluno: (Digite 0 para encerrar) ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE));
		

			if (raAluno != 0) 
			{
			listaRA.add(raAluno);
			}
		
		} while (raAluno != 0);
		
		for (int aux = 0; aux < listaNomes.size() - 1; aux++) 
		{
			for (int x = 0; x < listaNomes.size() - 1; x++) {
				if (listaNomes.get(x).compareToIgnoreCase(listaNomes.get(x + 1)) < 0) {
			         tempAlunos = listaNomes.get(x);
			         listaNomes.set(x, listaNomes.get(x+1));
			         listaNomes.set(x + 1, tempAlunos);
			         
			         tempRA = listaRA.get(x);
			         listaRA.set(x, listaRA.get(x+1));
			         listaRA.set(x + 1, tempRA);
				}
			}
		} 
		
		nomePesquisa = JOptionPane.showInputDialog(null, 
				"Digite um nome para pesquisar: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int pos = -1;
		
		for(int aux = 0; aux < listaNomes.size(); aux++) {
			if (listaNomes.get(aux).equalsIgnoreCase(nomePesquisa))
			{
				JOptionPane.showMessageDialog(null, 
						"O nome foi encontrado!",
						"Dados",
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"RA: "+listaRA.get(aux)+" na posição "+(pos + 1),
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				pos = aux;
				cont++;
			}
			
		}
		if (cont == 0) 
		{
			JOptionPane.showMessageDialog(null,
					"O nome não foi encontrado!",
					"Erro",
					JOptionPane.WARNING_MESSAGE);
		}
}}