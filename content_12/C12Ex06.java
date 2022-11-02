package content_12;
import java.util.Scanner;
public class C12Ex06 {
	public static void main(String[] args) {
		
		String[] nomeMeses = new String[12]; // Declaração de vetores
		Scanner teclado = new Scanner(System.in); // Leitura do Scanner
		
		for (int aux = 0; aux < nomeMeses.length; aux++) { // Estrutura de repetição
			System.out.println("Informe o nome dos meses em ordem cronológica: "); // Entrada do nome dos meses em ordem cronológica (vetores)
			nomeMeses[aux] = teclado.nextLine();
		}
		
		for (int aux = nomeMeses.length - 1; aux >= 0; aux--) { // Estrutura de repetição
			System.out.println("Meses em ordem inversa: "+nomeMeses[aux]); // Impressão do nome dos meses em ordem inversa
		}
		teclado.close(); // Fechamento do Scanner

}}
