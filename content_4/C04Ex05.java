package content_4;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C04Ex05 {
	public static void main(String[] args) {
	//entrada de dados
	//declaração de variáveis
		Scanner arquivo = new Scanner(
				C04Ex05.class.getResourceAsStream("dados.txt"));
		String nome, empresa;
		long cpf;
		int titEleitor, cnh, id;
		double salario;
		
		System.out.println("Informe o seu nome: ");
		nome = arquivo.nextLine();
		
		System.out.println("Informe o seu cpf: ");
		cpf = arquivo.nextLong();
		
		System.out.println("Informe o número da sua carteira de identidade: ");
		id = arquivo.nextInt();
		
		System.out.println("Informe o seu título de eleitor: ");
		titEleitor = arquivo.nextInt();
		
		System.out.println("Informe a sua carteira de motorista: ");
		cnh = arquivo.nextInt();
		
		System.out.println("Informe o nome da sua empresa: ");
		empresa = arquivo.nextLine();
		
		System.out.println("Informe o seu salário: ");
		salario = arquivo.nextDouble();
		
		//saída de dados
		
		JOptionPane.showMessageDialog(null,
				"FICHA FUNCIONAL DE: "+nome+"\nDocumentos:\nCPF: "+cpf+"\nCarteira de Identidade: "+id+"\nTítulo de eleitor: "+titEleitor+"\nCarteira de Motorista: "+cnh+"\n\nEmpresa: "+empresa+"\nSalário: "+salario,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);

		arquivo.close();
		}

}
