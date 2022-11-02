package content_8;
public class C08Ex26 {
	public static void main(String[] args) {
		 
		// ESTRUTURAS DE REPETIÇÕES (FOR DENTRO DO FOR)
		for (int aux3 = 1; aux3 <= 10; aux3++) {
			for (int aux2 = 1; aux2 <= 10; aux2++) {
				for (int aux = 1; aux <= aux2; aux++) 
					System.out.println(" ");
				System.out.println("*\n");
			}
			
			for (int aux2 = 10; aux2 >= 1; aux2-- ) {
				for (int aux = 1; aux <= aux2; aux++)
					System.out.println(" ");
				System.out.println("*\n");
			}
		}
	}

}
