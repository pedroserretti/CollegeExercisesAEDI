package content_5;
import java.util.Scanner;
public class C05Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double fx, x;
		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		fx = Math.pow(x,3) + 4 * x + 10;
		System.out.println("F(x): "+fx);
		teclado.close();
		}

}
