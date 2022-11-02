package content_4;
import java.util.Scanner;
public class C04Ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, cpf, empresa, rg;
		long titEleitor, cnh;
		double salario;
		
		System.out.print("Informe o seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Informe o seu cpf: ");
		cpf = teclado.nextLine();
		
		System.out.print("Informe o seu rg: ");
		rg = teclado.nextLine();
		
		System.out.print("Informe o seu título de eleitor: ");
		titEleitor = teclado.nextLong();
		
		System.out.print("Informe o seu cnh: ");
		cnh = teclado.nextLong();
		teclado.nextLine();
		
		System.out.print("Informe a empresa em que você trabalha: ");
		empresa = teclado.nextLine();
		
		System.out.print("Informe o seu salário: ");
		salario = teclado.nextDouble();
		
		System.out.println();
		System.out.println("FICHA FUNCIONAL DE: "+nome);
		System.out.println();
		System.out.println("Documentos: ");
		System.out.println("CPF ............................................. "+cpf);
		System.out.println("C.I. ............................................... "+rg);
		System.out.println("Título de eleitor .......................... "+titEleitor);
		System.out.println("Carteira de motorista ................... "+cnh);
		System.out.println();
		System.out.println("Empresa: "+empresa);
		System.out.println("Salário: R$"+salario);
		teclado.close();
	}

}
