package Modul1;

public class StudentRecord {
	 private String name;
	 private String address;
	 private int age;
	 private double mathGrade;
	 private double englishGrade;
	 private double scienceGrade;
	 private double average;
	
	 
	 private static int STUDENTCOUNT;
	 public StudentRecord(){ //constructor default
	 STUDENTCOUNT++;
	 }
	 
	//dan seterusnya, berisi n konstruktor lainnya yang telah Anda tambahkan
	 /**
	 * Menghasilkan nama dari siswa
	 */
	 public String getName(){
	 return name;
	 
	 }
	 /**
	 * mengubah nama siswa
	 */
	 public void setName(String temp){
		 name = temp;
	 }
	 
	 public String getAddress(){
		 return address;
	 }
	 
	 public void setAddress(String temp){
		 address = temp;
	 }
	 
	 	public int getAge(){
	 		return age;
	 }
	 	
	 public void setAge(int temp){
		 age = temp;
	 } 
	 
	 
	//area penulisan kode lain
	 /**
	 * Menghitung rata-rata nilai matematika, bahasa inggris, ilmu
	pengetahuan
	 */
	 public double getAverage(){
		 double result =0;
		 	result = (mathGrade+englishGrade+scienceGrade)/3;
		 		return result;
	 }
	 
	 public static int getStudentRecord(){
		 return STUDENTCOUNT;
	 }
	 
	 public void print(String temp){
		 System.out.println("Name : "+name );
		 System.out.println("Address : "+address);
		 System.out.println("Age : "+age);
	 }
	 
	 public void print(double eGrade, double mGrade, double sGrade){
		 System.out.println("Name : "+name);
		 System.out.println("Math Grade : "+mGrade);
		 System.out.println("English Grade : "+eGrade);
		 System.out.println("Science Grade : "+sGrade);
	 }
	 
	 public double getEnglishGrade() {
		 return englishGrade;
	 }
	 
	 
	 public void setEnglishGrade(double englishGrade) {
		 this.englishGrade = englishGrade;
	 }
	 
	 
	 public double getMathGrade() {
		 return mathGrade;
	 }
	 
	 
	 public void setMathGrade(double mathGrade) {
		 this.mathGrade = mathGrade;
	 }
	 
	 
	 public double getScienceGrade() {
	 return scienceGrade;
	 }
	 
	 
	 public void setScienceGrade(double scienceGrade) {
		 this.scienceGrade = scienceGrade;
	 }
	}
