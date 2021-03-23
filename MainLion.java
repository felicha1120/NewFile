package Modul1;


import java.awt.Color;
public class MainLion {
	public static void main (String[] args) {
		Lion Mpus = new Lion();
		Mpus.nama = "Mpus";
		Mpus.warnaBulu = new Color (0 ,1 , 1);
		Mpus.usia = 35;
		Mpus.bb = 70;
		Mpus.diadopsi("Fakhrul");
		Mpus.cetakInformasi();
    }
}