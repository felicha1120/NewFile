package Modul1;

import java.awt.Color;
public class MainKanggoro {
	public static void main (String[] args) {
		Kanggoro Ucup = new Kanggoro();
		Ucup.nama = "Ucup";
		Ucup.warnaBulu = new Color (255,255,0);
		Ucup.usia = 35;
		Ucup.bb = 85;
		Ucup.height = 25;
		Ucup.diadopsi("Fakhrul");
		Ucup.cetakInformasi();
    }
}