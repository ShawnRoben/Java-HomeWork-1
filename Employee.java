import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Employee {
	
	private int empID,empYearsOfEmployment;
	private String empFirstName, empLastName,empCity,empState;
	
	public Employee(int empID, String empFirstName, String empLastName, String empCity, 
			String empState, int empYearsOfEmployment) {
		
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empCity = empCity;
		this.empState = empState;
		this.empYearsOfEmployment = empYearsOfEmployment;
		
	}
	public Employee() {}
	
public int getEmpID() {
		return empID;
	}
	public int getEmpYearsOfEmployment() {
		return empYearsOfEmployment;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpYearsOfEmployment(int empYearsOfEmployment) {
		this.empYearsOfEmployment = empYearsOfEmployment;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
		
	}
}


	
	
	
	
	
	

