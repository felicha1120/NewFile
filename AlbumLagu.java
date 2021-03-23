package Modul1;

public class AlbumLagu {
	 String judul;
	 String artis;
	 int tahunRilis;
	 
	 
	 // Konstruktor
	 public AlbumLagu(String judul, String artis, int tahunRilis) {
		 this.judul = judul;
		 this.artis = artis;
		 this.tahunRilis = tahunRilis;
	 }
	 
	 public String infoJudul() {
		 return(judul);
	 }
	 
	 public String infoArtis() {
		 return(artis);
	 }
	 
	 public int infoTahunRilis() {
		 return(tahunRilis);
	 } 
	 
}
