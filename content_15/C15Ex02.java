package content_15;

import javax.swing.JOptionPane;

public class C15Ex02 extends C15Ex01 {

	private String memRam;
	private String processador;
	
	public C15Ex02(){
	}
	
	public C15Ex02(String modelo, int anoLanc, String sisOper, String numMem, String valor, String memRam, String processador) {
		super(modelo, anoLanc, sisOper, numMem, valor);
		this.memRam = memRam;
		this.processador = processador;
	}
	
	public String getMemRam() {
		return this.memRam;
	}
	
	public String getProcessador() {
		return this.processador;
	}
	
	public void setMemRam(String memRam) {
		this.memRam = memRam;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void ImprimeCelular() {
		JOptionPane.showMessageDialog(null, 
				"Modelo: "+ getModelo()+
				"Processador: " + getProcessador()+ 
				"\nMemória RAM: " + getMemRam(),
				"\nFicha técnica",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
