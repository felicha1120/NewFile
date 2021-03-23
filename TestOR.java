package Modul1;

public class TestOR {

	public static void main(String[] args) {
			int i = 0;
			int j = 10;
			boolean test= false;
		/**kerjakan seperti pada Program I-5 namun program ini berisi untuk
		*mengujikan perbedaan antara operator | dan II
		*/ 
			 test = (i > 10)||(j++ > 9);
			 System.out.println(i);
			 System.out.println(j);
			 System.out.println(test);
			 //contoh &
			 test = (i > 10)|(j++ > 9);
			 System.out.println(i);
			 System.out.println(j);
			 System.out.println(test);

	}

}
