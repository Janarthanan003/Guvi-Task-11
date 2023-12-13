package oopsconcept;

public class Employee {
	private String firstname;
	private String lastname;
	private int ID;
	private int age;
	private int salary;
	private int raiseSalary;
	public Employee(String firstname,String lastname,int ID, int age, int salary,int raiseSalary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ID = ID;
		this.age = age;
		this.salary = salary;
		this.raiseSalary= raiseSalary;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getID() {
		return ID;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public int getraiseSalary() {
		return raiseSalary;
	}
	 public String toString() {
	        return "Employee{" + "Firstname=" + firstname + '\'' + ",Lastname=" + lastname +", ID='" + ID + '\'' + ", age=" + age + '\'' + ", salary=" + salary + ", raiseSalary=" + raiseSalary +'}';
	 }
	 public static void main(String[] args) {
	        Employee emp = new Employee("Joel","Raj",01,30,20000,50000);
	        System.out.println(emp.toString());
	    }
	}