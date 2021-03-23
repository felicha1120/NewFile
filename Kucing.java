package Modul1;


import java.awt.Color;
class  Kucing {
	private String nama;
	private String warnaBulu;
	private int usia;
	private double bb;
	private boolean statusJinak;
	private String majikan;
	private String Diadopsi;

// ================================
	public void setnama(String nama){
		this.nama = nama;
	}
	
	public void setwarnaBulu(String warnaBulu){
		this.warnaBulu = warnaBulu;
	}
	public void setusia(int usia){
		this.usia = usia ;
	}
	
	public void setbb(double bb){
		this.bb = bb;
	}
	
	public void setDiadopsi (String m){
		majikan = m;
		statusJinak = true;
		this.Diadopsi = Diadopsi;

	}
	
	//===============================================
	
		public String getnama(){
		return	this.nama;
	}
	
	public String getwarnaBulu(){
		return this.warnaBulu;
	}
	public int getusia(){
		return this.usia ;
	}
	
	public double getbb(){
		return this.bb;
	}
	
	public String getDiadopsi (){
		return this.Diadopsi;

	}
}