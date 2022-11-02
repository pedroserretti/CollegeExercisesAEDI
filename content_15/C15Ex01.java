package content_15;

import javax.swing.JOptionPane;

public class C15Ex01 {
	
	private String modelo;
	private int anoLanc;
	private String sisOper;
	private String numMemoria;
	private String valor;
	
	public C15Ex01() {
	}
	
	public C15Ex01 (String modelo, int anoLanc, String sisOper, String numMemoria, String valor) {
		this.modelo = modelo;
		this.anoLanc = anoLanc;
		this.sisOper = sisOper;
		this.numMemoria = numMemoria;
		this.valor = valor;	
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public int getAnoLanc() {
		return this.anoLanc;
	}
	
	public String getSisOper() {
		return this.sisOper;
	}
	
	public String getNumMemoria() {
		return this.numMemoria;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public void setNumMemoria(String numMemoria) {
		this.numMemoria = numMemoria;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoLanc(int anoLanc) {
		this.anoLanc = anoLanc;
	}
	
	public void setSisOper(String sisOper) {
		this.sisOper = sisOper;
	}
	
	public void ImprimeCelular() {
		JOptionPane.showMessageDialog(null, 
				"Modelo: " + getModelo()+ 
				"\nAno de Lançamento: " + getAnoLanc()+
				"\nSistema Operacional: " + getSisOper()+
				"\nQuantidade de memória: " + getNumMemoria()+
				"\nValor: " + getValor(),
				"\nFicha técnica",
				JOptionPane.INFORMATION_MESSAGE);
				
	}

}
