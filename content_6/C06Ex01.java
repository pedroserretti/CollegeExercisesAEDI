package content_6;
import java.util.Scanner;
import java.lang.Math;
public class C06Ex01 {
	public static void main(String[] args) {
		
		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		int valorX;
		double funcaoFx;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de X: ");
		valorX = teclado.nextInt();
		
		if (valorX < 4) 
			funcaoFx = ((5 * valorX) + 3)/ Math.sqrt(16 - Math.pow(valorX, 2));
				 
		else 
			if (valorX == 4) funcaoFx = 0;
			
		
			else 
			funcaoFx = ((5 * valorX) + 3)/ Math.sqrt(Math.pow(valorX, 2) - 16);
		
		
		
		//SA�DA DE DADOS 
		System.out.println("Fun��o : "+funcaoFx);
		teclado.close();
		
		}
			
	}


