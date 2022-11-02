package content_13;
public class C13Ex02 {
	public static double funcaoX(int valorX) {
		
		if (valorX < 4) {
			return (5 * valorX + 3)/ Math.sqrt(16 - Math.pow(valorX, 2));
		}
		
		else if (valorX == 4) {
			return 0;
		}
		
		else
			return (5 * valorX + 3)/ Math.sqrt(Math.pow(valorX, 2) - 16);
	}

}
