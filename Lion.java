package Modul1;


import java.awt.Color;
public class Lion {
	public String nama;
	public Color warnaBulu;
	public int usia;
	public double bb;
	public boolean statusJinak;
	public String majikan;
	
	public void cetakInformasi(){
		System.out.println("Lion Bernama 	:"+nama);
		System.out.println("Warna Bulu  	:"+warnaBulu);
		System.out.println("Usia 		:"+usia);
		System.out.println("Berat Badan 	:"+bb);
		System.out.println("Jinak ? 	:"+apakahJinak());
		System.out.println("Diadopsi oleh  	:"+majikan);
	}
	
	public void diadopsi (String m){
		majikan = m;
		statusJinak = false;
	}
	
	public boolean apakahJinak(){
		return statusJinak;
	}
	public void dilepas(){
		majikan = "";
		statusJinak = true;
	}
}
