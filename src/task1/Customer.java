package task1;

public class Customer {
	
	String firstName;
	String secondName;
	double expenses;
	
	Customer(String firstName,String secondName,double expenses){
		this.firstName = firstName;
		this.secondName = secondName;
		this.expenses = expenses;
	}
	
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	

}
