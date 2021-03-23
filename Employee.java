package Modul1;

public class Employee extends Person3{
	 public String getName() {
	 System.out.println("Employee Name: " +name);
	 return name;
	 }
	 public static void main(String[] args)
	 {
	 Person3 ref;
	 Student3 studentObject = new Student3();
	 Employee employeeObject = new Employee();

	 ref = studentObject; //Person menunjuk kepada object Student

	 String temp = ref.getName(); //getName dari Student class dipanggil
	 System.out.println(temp);

	 ref = employeeObject; //Person menunjuk kepada object Employee

	 temp = ref.getName(); //getName dari Employee class dipanggil
	 System.out.println(temp);
	 }
	}
