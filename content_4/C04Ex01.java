package content_4;
import java.util.Scanner;
public class C04Ex01 {
	public static void main(String[] args) {
		String sobrenome, PrimeiroNome, SegundoNome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.print("Informe seu primeiro nome: ");
		PrimeiroNome = teclado.nextLine();
		System.out.print("Informe o seu segundo nome: ");
		SegundoNome = teclado.nextLine();
		System.out.print("Informe a sua idade: ");
		idade = teclado.nextInt();
		System.out.println(sobrenome+", "+PrimeiroNome+" "+SegundoNome);
		System.out.println("Idade: "+idade);
		teclado.close();	
	}

}
