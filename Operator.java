package Modul1;

public class Operator {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 3;
		int k = 0;
		// Cetak Hasil 
		
		k = ++j + i;
		 System.out.println("Nilai K = "+k);
		k = j++ +i;
		 System.out.println("Nilai K = "+k);
		k = --j -i;
		 System.out.println("Nilai K = "+k);
		k = j-- -i;
		 System.out.println("Nilai K = "+k);
	}

}
