package content_12;
import javax.swing.JOptionPane;
public class C12Ex14 {
	public static void main(String[] args) {

		String[] nomeCid = new String[12];
		String[] estado = new String[12];
		String tempEst;
		String tempCid;
		String impressao = "";
		double[] numPop = new double[12];
		double tempPop;
		int cont = numPop.length-1;
		
		for (int aux = 0; aux < 12; aux++) {
			
			nomeCid[aux] = JOptionPane.showInputDialog(null, "Informe o nome da cidade: ", "Dados", JOptionPane.QUESTION_MESSAGE);
			
			estado[aux] = JOptionPane.showInputDialog(null, "Informe o nome do estado: ", "Dados", JOptionPane.QUESTION_MESSAGE);
			
			numPop[aux] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o número da população: ", "Dados", JOptionPane.QUESTION_MESSAGE));
		}
		
		for (int aux = 0; aux < numPop.length-1; aux++) {
			for (int x = 0; x < cont; x++)
				if (numPop[x] < numPop[x + 1]) {
					tempPop = numPop[x];
					numPop[x] = numPop[x + 1];
					numPop[x + 1] = tempPop;
					
					tempCid = nomeCid[x];
					nomeCid[x] = nomeCid[x + 1];
					nomeCid[x + 1] = tempCid;
					
					tempEst = estado[x];
					estado[x] = estado[x + 1];
					estado[x + 1] = tempEst;
				}
			cont--;
		}
	
		for (int aux = 0; aux < 12; aux++) {
			impressao += nomeCid[aux] + ", " + estado[aux] + " " + numPop[aux] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Dez maiores cidades em número de população: "+impressao, "Resultado", JOptionPane.INFORMATION_MESSAGE);

}}
