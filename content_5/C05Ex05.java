package content_5;
import java.util.Scanner;
public class C05Ex05 {
	public static void main(String[] args) {
		
		//ENTRADA DE DADOS E DECLARA��O DE VARI�VEIS
		double tempCelsius, tempKelvin, tempFahrenheit;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor da temperatura em celsius: ");
		tempCelsius = teclado.nextDouble();
		
		tempKelvin = tempCelsius + 273;
		tempFahrenheit = ((tempCelsius * 9) +160)  / 5;
		
		//SA�DA DE DADOS
		System.out.println();
		System.out.println("Kelvin= "+tempKelvin);
		System.out.println("Fahrenheit= "+tempFahrenheit);
		teclado.close();
	}

}
