package content_12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class C12Ex27 {
	public static void main(String[] args) {
		
		List <Integer> listaCpf = new ArrayList<Integer>();
		List <String> listaEnd = new ArrayList<String>();
		int numCpf, pesquisaCpf;
		int cont = 0;
		String opcao = null;
		String nomeEnd, novoEnd;
		Scanner teclado = new Scanner(System.in);
		
		do 
		{
			System.out.println("Informe um CPF: (Digite 0 para encerrar)");
			numCpf = teclado.nextInt();
			
			if (numCpf != 0) 
			{
				listaCpf.add(numCpf);
			}
		} 
		while (numCpf != 0);
		
		teclado.nextLine();
		do 
		{
			System.out.println("Informe o nome do endereço: (Digite X para encerrar)");
			nomeEnd = teclado.nextLine();
			
			if (!nomeEnd.equalsIgnoreCase("X")) 
			{
				listaEnd.add(nomeEnd);
			}
		} 
		
		while (!nomeEnd.equalsIgnoreCase("X"));
		
		System.out.println("Digite um CPF para pesquisar: ");
		pesquisaCpf = teclado.nextInt();
		teclado.nextLine();
		
		for(int aux = 0; aux < listaCpf.size(); aux++) {
			if (pesquisaCpf == listaCpf.get(aux)) {
				
				System.out.println("Você deseja alterar ou excluir o endereço? (A/E)");
				opcao = teclado.nextLine();
				cont++;
				
				if (opcao.equalsIgnoreCase("A")) 
				{
					System.out.println("Digite o novo endereço: ");
					novoEnd = teclado.nextLine();
					listaEnd.set(aux, novoEnd);
					break;
				}
				
				else if(opcao.equalsIgnoreCase("E")) 
				{
					System.out.println("O endereço e o CPF foram excluídos.");
					listaCpf.remove(aux);
					listaEnd.remove(aux);
					break;
				}
			}
		}
		
		if(cont == 0) 
		{
			System.out.println("O CPF não foi encontrado!");
		}
	
		for(int aux = 0; aux < listaCpf.size(); aux++) 
		{
			System.out.println("CPF's: "+listaCpf.get(aux)+" Endereços: "+listaEnd.get(aux) + " ");	
		}
		teclado.close();
	}
}