package Modul1;
public class cetakBiodata {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		
		p.name = "Fakhrul";
		p.gender = 'L';
		p.address = "Cianjur";
		p.dateOfBirth ="20 November 2000";
		
		// Cetak
		
		System.out.println("Nama = "+p.name);
		System.out.println("Gender = "+p.gender);
		System.out.println("Alamat = "+p.address);
		System.out.println("Tanggal Lahir = "+p.dateOfBirth);

	}

}


