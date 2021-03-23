package Modul1;
import java.awt.Color;


public class MainKucing{
	public static void main (String[] args) {
		Kucing Michael = new Kucing();
		Michael.setnama("Michael");
		Michael.setwarnaBulu("Orange");
		Michael.setusia(10);
		Michael.setbb(12);
		Michael.setDiadopsi("Fakhrul");
		
		System.out.println("Nama Kucing = "+Michael.getnama());
		System.out.println("Warna Bulu = "+Michael.getwarnaBulu());
		System.out.println("Usia Kucing ="+Michael.getusia());
		System.out.println("Berat Badan Kucing = "+Michael.getbb());
		System.out.println("Diadopsi oleh = "+Michael.getDiadopsi());
		
		System.out.println("<==============================================>");
		// Garfield
		Kucing Garfield = new Kucing();
		Garfield.setnama("Garfield");
		Garfield.setwarnaBulu("White");
		Garfield.setusia(12);
		Garfield.setbb(15);
		Garfield.setDiadopsi("Fakhrul");
		
		System.out.println("Nama Kucing = "+Garfield.getnama());
		System.out.println("Warna Bulu = "+Garfield.getwarnaBulu());
		System.out.println("Usia Kucing = "+Garfield.getusia());
		System.out.println("Berat Badan Kucing = "+Garfield.getbb());
		System.out.println("Diadopsi oleh = "+Garfield.getDiadopsi());
    }
}