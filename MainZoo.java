package Modul1;

public class MainZoo {
	public static void main (String[]args){
	Zoo Lion = new Zoo();
	Zoo Horse = new Zoo();
	Zoo Kanggoro = new Zoo();
	
	System.out.println("<================================================>");
	
	
	Lion.setNama("Rext");
	Lion.setWarnabulu("Orange");
	Lion.setUsia(12);
	Lion.setBb(20);
	Lion.setMajikan("Fakhrul");
	Lion.setStatusJinak(true);
	System.out.println("Nama Singa : "+Lion.getName());
	System.out.println("Warna : "+Lion.getWarnabulu());
	System.out.println("Usia : "+Lion.getusia());
	System.out.println("Status Jinak : "+Lion.getstatusJinak());
	
	
	System.out.println("<================================================>");
	Horse.setNama("Udin");
	Horse.setWarnabulu("White");
	Horse.setUsia(15);
	Horse.setBb(45);
	Horse.setMajikan("Fakhrul");
	Horse.setStatusJinak(true);
	System.out.println("Nama Kuda : "+Horse.getName());
	System.out.println("Warna : "+Horse.getWarnabulu());
	System.out.println("Usia : "+Horse.getusia());
	System.out.println("Status Jinak : "+Horse.getstatusJinak());
	
	
	System.out.println("<================================================>");
	
	Kanggoro.setNama("Ricard");
	Kanggoro.setWarnabulu("Brown");
	Kanggoro.setUsia(14);
	Kanggoro.setBb(35);
	Kanggoro.setMajikan("Fakhrul");
	Kanggoro.setStatusJinak(true);
	System.out.println("Nama Kangguru : "+Kanggoro.getName());
	System.out.println("Warna : "+Kanggoro.getWarnabulu());
	System.out.println("Usia : "+Kanggoro.getusia());
	System.out.println("Status Jinak : "+Kanggoro.getstatusJinak());
	
	}
}