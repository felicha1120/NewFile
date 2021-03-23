package Modul1;

public class Buku {
		String penulis;
		String judul;
		int nomorISBN;
	 
	 
	 // Konstruktor
	 
	 public Buku(String penulis, String judul, int nomorISBN) {
	 this.penulis = penulis;
	 this.judul = judul;
	 this.nomorISBN = nomorISBN;
	 } 
	 
	 
	 public String penulis() {
		 return(penulis);
	 }
	 
	 
	 public String judul() {
		 return(judul);
		 
	 }
	 
	 public int nomorISBN() {
		 return(nomorISBN);
	 }
}
