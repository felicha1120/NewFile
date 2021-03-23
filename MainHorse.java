package Modul1;


import java.awt.Color;
public class MainHorse {
	public static void main (String[] args) {
		Horse Ujang = new Horse();
		Ujang.nama = "Ujang";
		Ujang.warnaBulu = new Color (255,255,0);
		Ujang.usia = 35;
		Ujang.bb = 70;
		Ujang.height = 25;
		Ujang.diadopsi("Fakhrul");
		Ujang.cetakInformasi();
  }
}