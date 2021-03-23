package Modul1;

public class MainBuku {

	public static void main(String[] args) {
		Buku buku = new Buku("Gege Akutami","Jujutsu Kaisen", 5169);
		
		System.out.println("Nama Penulis = "+ buku.penulis);
		System.out.println("Judul Buku = "+buku.judul);
		System.out.println("Nomor ISBN = "+buku.nomorISBN);

	}

}
