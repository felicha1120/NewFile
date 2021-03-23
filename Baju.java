package Modul1;

	public class Baju extends Pakaian {
		

		 //Kode Warna R=Merah, B=Biru, G=Hijau, U=Belum Ditentukan
		 public char kodeWarna = 'U';
		 //Method ini menampilkan nilai untuk suatu item
		

		 public void tampilInformasiBaju(){
		
			 
		 
		 System.out.println("ID Baju: " + getID());
		 System.out.println("Keterangan: " + getKeterangan());
		 System.out.println("Kode Warna: " + kodeWarna);
		 System.out.println("Harga baju: " + getHarga());
		 System.out.println("Jumlah stok: " + getJmlStok());
		
		 }//akhir method display
		
	
	}//akhir kelas 
	

 


