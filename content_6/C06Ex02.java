package content_6;
import java.util.Scanner;
import java.text.DecimalFormat;
public class C06Ex02 {
	public static void main(String[] args) {
		
		//ENTRADA DE DADOS E DECLARAÇÃO DE VARIÁVEIS
		double multa, qtPoluentes;
		String multaFormat;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de poluentes emitidos: ");
		qtPoluentes = teclado.nextDouble();
		
		if (qtPoluentes <=1500 ) {
			multa = 0;
		}
		else if (qtPoluentes > 1500 && qtPoluentes <= 3500) {
			multa = 3000;
			
		}
		
		else {
			multa = 5000 * qtPoluentes;
		}
		
		multaFormat = new DecimalFormat("R$#,##0.00").format(multa);
		
		//SAÍDA DE DADOS
		System.out.println("Multa : "+multaFormat);
		teclado.close();
		
		
		
	}

}
