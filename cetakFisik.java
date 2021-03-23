package Modul1;

public class cetakFisik {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.weight = 86;
		p.height = 180;

		
		// Cetak
		
		System.out.println("Berat badan anda = "+ p.weight);
		System.out.println("Tinggi badan anda  = "+ p.height);
	}

}
