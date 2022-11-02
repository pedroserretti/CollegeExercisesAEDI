package content_13;
import javax.swing.JOptionPane;
import java.lang.Math;
public class C13Ex05 {
	public static void main(String[] args) {

		double angulo = 30, conversao;

		conversao = Math.toRadians(angulo);
		
		JOptionPane.showMessageDialog(null,
				"\nSeno: "+Math.sin(conversao)+
				"\nCosseno: "+Math.cos(conversao)+
				"\nTangente: "+Math.tan(conversao)+
				"\nArco Seno: "+1/ Math.sin(conversao)+
				"\nArco Cosseno: "+1/ Math.cos(conversao)+
				"\nArco Tangente: "+1/ Math.tan(conversao),
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		
		
	}

}
