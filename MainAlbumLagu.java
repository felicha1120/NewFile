package Modul1;

public class MainAlbumLagu {

	public static void main(String[] args) {
		
		 AlbumLagu album = new AlbumLagu("I Love Java Code","Rzk",2016);
		 
		 System.out.println("Judul Album: "+album.infoJudul());
		 System.out.println("Artis: " + album.infoArtis());
		 System.out.println("Tahun: " + album.infoTahunRilis());

	}

}
