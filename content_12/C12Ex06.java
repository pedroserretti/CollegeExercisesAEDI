package content_12;
import java.util.Scanner;
public class C12Ex06 {
	public static void main(String[] args) {
		
		String[] nomeMeses = new String[12]; // Declara��o de vetores
		Scanner teclado = new Scanner(System.in); // Leitura do Scanner
		
		for (int aux = 0; aux < nomeMeses.length; aux++) { // Estrutura de repeti��o
			System.out.println("Informe o nome dos meses em ordem cronol�gica: "); // Entrada do nome dos meses em ordem cronol�gica (vetores)
			nomeMeses[aux] = teclado.nextLine();
		}
		
		for (int aux = nomeMeses.length - 1; aux >= 0; aux--) { // Estrutura de repeti��o
			System.out.println("Meses em ordem inversa: "+nomeMeses[aux]); // Impress�o do nome dos meses em ordem inversa
		}
		teclado.close(); // Fechamento do Scanner

}}
