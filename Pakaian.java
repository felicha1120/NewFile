package Modul1;

public class Pakaian {

	private int ID = 0; // Default ID untuk semua Pakaian
	 private String keterangan = "-keterangan diperlukan-"; // default
	 private double harga = 0.0; // Harga default untuk semua Pakaian
	 private int jmlStok = 0; // jumlah default untuk semua Pakaian
	 private static int UNIQUE_ID=0; //Static member ditambahkan dalam
	//constructor
	 //untuk menghasilkan ID yang unik
	 public Pakaian() {
	 ID=UNIQUE_ID++;
	 }
	 public int getID() {
	 return ID;
	 }
	 public void setKeterangan (String d){
	 keterangan=d;
	 }
	 public String getKeterangan(){
	 return keterangan;
	 }
	 public void setHarga(double p) {
		 harga = p;
	 }
	 public double getHarga() {
	 return harga;
	 }
	 public void setJmlStok (int q){
	 jmlStok=q;
	 }
	 public int getJmlStok(){
	 return jmlStok;
	 }
	 
	}
	

