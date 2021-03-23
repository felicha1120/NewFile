package Modul1;

public class Person2 {
	
	 protected String name;
	 protected String address;
	 
	 public Person2(){
	 System.out.println("Inside Person:Constructor");
	 name = "";
	 address = "";
	 }
	 
	 
	 public Person2( String name, String address) {
	 this.name = name;
	 this.address = address;
	 }
	 
	 
	 public String getName() {
		 return name;
	 }
	 
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 
	 public void setAddress(String add) {
		 this.address = add;
	 } 

}
