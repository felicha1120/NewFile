package Modul1;

public abstract class LivingThing {
	
	
	 public void breath(){
		 System.out.println("Living Thing breathing..."); }
	 
	 	public void eat(){
	 		System.out.println("Living Thing eating..."); 
	 }
	 /**
	 * abstract method walk
	 * Kita ingin method ini di-overridden oleh subclasses
	 */
	 public abstract void walk();
	}
	
	
