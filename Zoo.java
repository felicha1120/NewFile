package Modul1;

import java.awt.Color;
class Zoo {
	private String name;
	private String warnaBulu;
	private int usia;
	private double bb;
	private boolean statusJinak;
	private String majikan;
	
	public String getName(){
		return name;
	}
	
	public void setNama(String temp){
	name = temp;
	}

	public String getWarnabulu(){
		return warnaBulu;
	}	
		
	public int getusia(){
		return usia;
	}
	
	public double getbb(){
		return bb;
	}
	
	public boolean getstatusJinak(){
		return statusJinak;
	}
	
	public String getmajikan(){
		return majikan;
	}
	

		public void setWarnabulu(String warnaBulu){
		this.warnaBulu = warnaBulu;
	}	
		
	public void setUsia(int usia){
		this.usia = usia;
	}
	
	public void setBb(double bb){
		this.bb = bb;
	}
	
	public void setStatusJinak(boolean statusJinak){
		this.statusJinak = statusJinak;
	}
	
	public void setMajikan(String majikan){
		this.majikan = majikan;
	}
	

	
}