package content_8;
public class C08Ex27 {
	public static void main(String[] args) {
		
		// ESTRUTURAS DE REPETI��ES (FOR DENTRO DO FOR)
		for (int aux3 = 1; aux3 <= 10; aux3++) {
			for (int aux2 = 0; aux2 <= 7; aux2++) {
				for (int aux = 1; aux <= Math.pow(2, aux2); aux++)
					System.out.print("*");
				System.out.println();
			}
			for (int aux2 = 8; aux2 >= 0; aux2--) {
				for (int aux = 1; aux <= Math.pow(2, aux2); aux++)
					System.out.print("*");
				System.out.println();
			}
		}

	}

}
