package Modul1;

import java.awt.Color;
public class Horse {
	public String nama;
	public Color warnaBulu;
	public int usia;
	public double bb;
	public boolean statusJinak;
	public String majikan;
	public float height;
	
	public void cetakInformasi(){
		System.out.println("Horse Bernama 		:"+nama);
		System.out.println("Warna Bulu  		:"+warnaBulu);
		System.out.println("Usia 			:"+usia);
		System.out.println("Berat Badan 		:"+bb);
		System.out.println("Jinak ? 		:"+apakahJinak());
		System.out.println("Diadopsi oleh  		:"+majikan);
		System.out.println("Tinggi Badan  		:"+height);
		
	}
	
	public void diadopsi (String m){
		majikan = m;
		statusJinak = true;
	}
	
	public boolean apakahJinak(){
		return statusJinak;
	}
	public void dilepas(){
		majikan = "";
		statusJinak = false;
	}
}