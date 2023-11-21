package com.pi.pangolinux.back.objects;

public class Endereco {

	// atributos
	
	private String logradouro = "";
	private String numero = "";
	private String bairro = "";
	private String referencia = "";
	private String latitude = "";
	private String longitude = "";
	private String municipio = "";
	private String complemento = "";
	private int CEP = 0;
	
	// Constructor:
	
	public Endereco() {
		
	}
	
	public Endereco(String Log, String Num, String Comp, String Bairro, String Ref, String Lati, String Long, String Muni, int CEP) {
		this.CEP = CEP;
		this.bairro = Bairro;
		this.latitude = Lati;
		this.logradouro = Log;
		this.longitude = Long;
		this.municipio = Muni;
		this.numero = Num;
		this.referencia = Ref;
		this.complemento = Comp;
	}
	
	public void atualizarEndereco(String Log, String Num, String Comp, String Bairro, String Ref, String Lati, String Long, String Muni, int CEP) {
		this.CEP = CEP;
		this.bairro = Bairro;
		this.latitude = Lati;
		this.logradouro = Log;
		this.longitude = Long;
		this.municipio = Muni;
		this.numero = Num;
		this.complemento = Comp;
		this.referencia = Ref;
	}
	
	// gets:
	
	public String getMuni() {
		return municipio;
	}
	
	public String getComp() {
		return complemento;
	}
	
	public String getLog() { 
		return logradouro;
	}
	
	public String getNum() { 
		return numero;
	}
	
	public String getBairro() { 
		return bairro;
	}
	
	public String getRef() { 
		return referencia;
	}
	
	public String getLati() { 
		return latitude;
	}
	
	public String getLong() { 
		return longitude;
	}
	
	public int getCEP() { 
		return CEP;
	}
	
	// sets:
	
	public void setLog(String newLog) { 
		this.logradouro = newLog;
	}
	
	public void setNum(String newNum) { 
		this.numero = newNum;
	}
	
	public void setBairro(String newBairro) { 
		this.bairro = newBairro;
	}
	
	public void setRef(String pontoReferencia) {
		this.referencia = pontoReferencia;
	}
	
	public void setLati(String newLati) { 
		this.latitude = newLati;
	}
	
	public void setLong(String newLong) { 
		this.longitude = newLong;
	}
	
	public void setMuni(String newMuni) { 
		this.municipio = newMuni;
	}
	
	public void setCEP(int newCEP) { 
		this.CEP = newCEP;
	}
	
	public void setComp(String newComp) {
		this.complemento = newComp;
	}
}