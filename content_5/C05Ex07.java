package content_5;
import java.util.Scanner;
import java.lang.Math;
public class C05Ex07 {
	public static void main(String[] args) {
		
		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		double funcaoX;
		int valorX;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de X: ");
		valorX = teclado.nextInt();
		 
		//C�LCULO DA FUN��O X
		funcaoX = Math.sqrt((Math.pow(valorX/4.0 + 1, 2)) + 1/5.0 * valorX);
		
		//SA�DA DE DADOS
		System.out.println("F(x): "+funcaoX);
		teclado.close();
		
		
		
		
	}

}
