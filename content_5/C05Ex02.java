package content_5;
import java.util.Scanner;
import java.lang.Math;
public class C05Ex02 {
	public static void main(String[] args) {
		double area, volume;
		int r;
		Scanner teclado = new Scanner(System.in);
		
		r = 10;
		area = 4 * 3.1416 * Math.pow(r,2);
		volume = 4.0/3 * 3.1416 * Math.pow(r,3);
		
		System.out.println("Área: "+area);
		System.out.println("Volume: "+volume);
				
		teclado.close();

	}

}
