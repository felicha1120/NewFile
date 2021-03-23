package Modul1;

public class Student3 extends Person3{
	 public Student3()
	 {
	 //super( "SomeName", "SomeAddress");
	 //super();
	 //super.name = "name";
		 
	 System.out.println("Inside Student:Constructor");
	 }
	 
	 public String getName() {
		 System.out.println("Student Name :  " +name);
		 return name;
	 
	 }
	 
	 public static void main( String[] args) {
		 Student3 anna = new Student3();
		 anna.setName("Anna");
		 System.out.println(" Name:" +anna.getName());
	 }
	 
} 
