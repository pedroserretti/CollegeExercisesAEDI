package content_5;
import java.util.Scanner;
public class C05Ex03 {
	public static void main(String[] args) {
		double impRenda, liquido;
		Scanner teclado = new Scanner(System.in);
		
		liquido = 1000 - (3 * 60.0);
		impRenda = 820 * 0.15;
		
		System.out.println("Líquido: "+liquido);
		System.out.println("Imposto de renda: "+impRenda);
		teclado.close();
		
		
		
	}

}
