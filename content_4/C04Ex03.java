package content_4;
import java.util.Scanner;
public class C04Ex03 {
	public static void main(String[] args) {
	
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		double multa1, multa2, multa3, polAtm1, polAtm2;
		
	
		System.out.println("Informe o valor da primeira multa: ");
		multa1 = teclado.nextDouble();
		
		System.out.println("Informe o valor da segunda multa: ");
		multa2 = teclado.nextDouble();
		
		System.out.println("Informe o valor da terceira multa: ");
		multa3 = teclado.nextDouble();
		
		System.out.println("Informe a quantidade do primeiro poluente emitido: ");
		polAtm1 = teclado.nextDouble();
		
		System.out.println("Informe a quantidade do segundo poluente emitido: ");
		polAtm2 = teclado.nextDouble();
		
		// SAÍDA DE DADOS
		
		System.out.println("Até "+polAtm1+" multa de R$"+multa1);
		System.out.println();
		System.out.println("Entre "+polAtm1+" e "+polAtm2+" multa de R$"+multa2);
		System.out.println();
		System.out.println("Acima de "+polAtm2+" multa de R$"+multa3+" por poluente emitido");
		teclado.close();
		
	}

}
