package content_8;
import java.util.Scanner;
public class C08Ex29 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		double potencia = 1;
		int valorX, valorY, num = 0;
	
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite um valor para X: ");
		valorX = teclado.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		valorY = teclado.nextInt();
		
		// COMANDO WHILE (ENQUANTO)
		
		while (num < valorY) {
			potencia *= valorX;
			num += 1;
		}
		
		// SAÍDA DE DADOS
		System.out.println("Potência: "+potencia);
		teclado.close();
	}

}
