package content_6;
import java.util.Scanner;
public class C06Ex17 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		String question1, question2, question3, question4, question5, question6, question7, question8, question9;
		@SuppressWarnings("unused")
		boolean answer1, answer2, answer3 = false, answer4, answer5, answer6, answer7, answer8, answer9, finalR;
		
		System.out.println("Você tem curso técnico de programação?");
		question1 = teclado.nextLine();
		
		System.out.println("Você tem curso superior de programação?");
		question2 = teclado.nextLine();
		
		System.out.println("Você tem menos de 3 anos de experiência em programação?");
		question3 = teclado.nextLine();
		
		System.out.println("Você se considera uma pessoa criativa?");
		question4 = teclado.nextLine();
		
		System.out.println("Você prefere liderar a ser liderado?");
		question5 = teclado.nextLine();
		
		System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe?");
		question6 = teclado.nextLine();
		
		System.out.println("Você é autodidata (aprende sozinho)?");
		question7 = teclado.nextLine();
		
		System.out.println("Você aceitaria uma remuneração inicial de R$1500?");
		question8 = teclado.nextLine();
		
		System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
		question9 = teclado.nextLine();
		
		// CÁLCULOS
		
		if (question1.equals("Verdadeiro")) {
			answer1 = true;
		}
		
		else {
			answer1 = false;
		}
		
		if (question2.equals("Verdadeiro")) {
			answer2 = true;
		}
		
		else {
			answer2 = false;
		}
		
		if (question3.equals("Falso")) {
			answer3 = false;
		}
		
		else {
			answer3 = true;
		}
		
		if (question4.equals("Verdadeiro")) {
			answer4 = true;
		}
		
		else {
			answer4 = false;
		}
		
		if (question5.equals("Verdadeiro")) {
			answer5 = true;
		}
		
		else {
			answer5 = false;
		}
		
		if (question6.equals("Falso")) {
			answer6 = false;
		}
		
		else {
			answer6 = true;
		}
		
		if (question7.equals("Verdadeiro")) {
			answer7 = true;
		}
		
		else {
			answer7 = false;
		}
		
		if (question8.equals("Verdadeiro")) {
			answer8 = true;
		}
		
		else {
			answer8 = false;
		}
		
		if (question9.equals("Falso")) {
			answer9 = false;
		}
		
		else {
			answer9 = true;
		}
		
		if (answer9 = true & answer3 == false) {
			finalR = true;
		}
		
		else if (answer2 = true) {
			finalR = true;
		}
		
		else if (answer1 = true & answer3 == true) {
			finalR = false;
		}
		
		if (answer5 = true) {
			answer8 = false;
		}
		
		// CÁLCULOS E SAÍDA DE DADOS 
		
		if (finalR = true && answer4 == true && answer5 == true && answer6 == false && answer7 == true && answer8 == false && answer9 == false) {
			System.out.println("Está apto");
		}
		
		else {
			System.out.println("Não está apto");
		}
		
		teclado.close();
		
			

	}

}