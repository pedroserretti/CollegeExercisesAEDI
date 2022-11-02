package content_13;
import java.util.Scanner;
public class C13Ex09 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Digite uma frase curta: ");
		String frase = teclado.nextLine();
			
		String[] palavras = frase.split("");

		for (String obj : palavras) {
			System.out.println(obj.substring(0, 1).toUpperCase() + obj.substring(1).toLowerCase());
		}
		teclado.close();
	}
}