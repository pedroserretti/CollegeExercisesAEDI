package content_8;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;	
public class C08Ex15 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner arquivo = new Scanner(
				C08Ex15.class.getResourceAsStream("c08ex15.txt"));
		
		// DECLARA��O DE VARI�VEIS
		int numIdade, cont = 0;
		float valorSalario, valorMedia = 0, valorTotal = 0, salarioMaior = 0;
		String nomeFunci, cargoFunci, nomeSalarioMaior = "";
	
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 6; aux++) {
			
			nomeFunci = arquivo.nextLine();
			cargoFunci = arquivo.nextLine();
			valorSalario = arquivo.nextFloat();
			numIdade = arquivo.nextInt();
			arquivo.nextLine();
			
			// CONDI��O
			if (valorSalario > 10000 && numIdade > 50) {
				JOptionPane.showMessageDialog(null,
						"Funcion�rio S�nior",
						"Dados",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			if (numIdade <= 18) {
				cont++;
				valorTotal = valorSalario + valorTotal;
			}
			
			if (aux == 1 || valorSalario > salarioMaior) {
				salarioMaior = valorSalario;
				nomeSalarioMaior = nomeFunci;
			}
		}
		
		// C�LCULO DA M�DIA
		valorMedia = (float) valorTotal/ cont;
		
		// FORMATA��O DE DECIMAL
		String valorMediaFormat = new DecimalFormat("R$##,##0.00").format(valorMedia);
		String salarioMaiorFormat = new DecimalFormat("R$##,##.0.00").format(salarioMaior);
		
		// SA�DA DE DADOS
		JOptionPane.showMessageDialog(null,
				"M�dia do sal�rio dos funcion�rios com at� 18 anos: \n"+valorMediaFormat+"\nMaior sal�rio: "+nomeSalarioMaior+" --- "+salarioMaiorFormat,
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		

}}
