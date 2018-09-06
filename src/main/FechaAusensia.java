package main;

public class FechaAusensia {
	private int dd;
	private int mm;
	private int aaaa;
	
	public FechaAusensia(int dd, int mm, int aaaa) {
		this.dd = dd;
		this.mm = mm;
		this.aaaa = aaaa;
	}
	
	public void setDias(int dd) {
		this.dd = dd;
	}
	
	public int getDias(){
		return dd;
	}
	
	public void setMeses(int mm) {
		this.mm = mm;
	}
	
	public int getMeses(){
		return mm;
	}
	
	public String setFechaAusensia() {
		return dd+"/"+mm+"/"+aaaa;
	}
}
