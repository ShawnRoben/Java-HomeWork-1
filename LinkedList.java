
import java.util.Scanner;

public class LinkedList {

	private class Node{
		
		private Employee e;
		private Node next;
		
		@SuppressWarnings("unused")
		public Node(Employee val, Node n){
			
			e = val;
			next = n;
			
		}
		public Node(Employee val){
			
			e = val;
			next = null;
			
		}
	}
	private Node first;
	private Node last;
	private int ctr;
	
	
	public LinkedList(){}
	
	public boolean isEmpty() {
		
		return first == null;
	}
	
	public int size() {
		
		int count = 0;
		Node p = first;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}
	
	public void add(Employee s) {
		 if (isEmpty()) 
	      {
	          first = new Node(s);
	          last = first;
	      }
	      else
	      {
	         
	          last.next = new Node(s);
	          last = last.next;
	      }      
	}
	
	public String toString()
    {
      StringBuilder strBuilder = new StringBuilder();
    
      Node p = first;
      while (p != null)
      {
         strBuilder.append( String.format("\n%-3s %-25s %-28s" ,p.e.getEmpID(),p.e.getEmpFirstName()+ " " + p.e.getEmpLastName(),p.e.getEmpYearsOfEmployment()) ); 
         p = p.next;
      }      
      return strBuilder.toString(); 
    }
	
	public String printEmps()
    {
      StringBuilder strBuilder = new StringBuilder();
    
      Node p = first;
      while (p != null)
      {
         strBuilder.append(p.e.getEmpFirstName()+ " " +p.e.getEmpLastName() + "\n"); 
         p = p.next;
      }      
      return strBuilder.toString(); 
    }
	
	
	public int getIndex(String empName) {
		
		int index = -1;
		int count = 0;
	boolean found = false;
	
	Node p = first;
	while(p != null && !found) {
		
		if(empName.equals(p.e.getEmpFirstName()+ " " + p.e.getEmpLastName())) {
			found = true;
			index = count;
		}
		
		else{
			count+=1;
			p = p.next;
			
		}
	}
	
	return index;
	
	}

	public void remove(int index)
    {
       if (index < 0 || index >= size())
       {  
           String message = String.valueOf(index);
           throw new IndexOutOfBoundsException(message);
       }
          
       if (index == 0)
       {
          
          first = first.next;
          if (first == null)
              last = null;             
       }
       else
       {
       
          Node pred = first;
          
          for (int k = 1; k <= index -1; k++) {
              pred = pred.next;
          }
          
          pred.next = pred.next.next;

          if (pred.next == null)
              last = pred;              
       }
       
    }  
	public void addToList(LinkedList ll, Scanner keyboard) {
		
		int nbr = 0;
		int empyears;
		String first, last, city, state;
		
		System.out.print("\nHow Many employees do you want to add? ");
		nbr = Integer.parseInt(keyboard.nextLine());
		
		for(int index = 0; index < nbr ; index++) {
			
			this.ctr = ll.last.e.getEmpID();
			this.ctr++;
			
		System.out.print("Enter Employee Info: \n");
		
		System.out.print("Enter first name: ");
		first = keyboard.nextLine();
		
		System.out.print("Enter last name: ");
		last = keyboard.nextLine();
		
		System.out.print("Enter city: ");
		city = keyboard.nextLine();
		
		System.out.print("Enter state: ");
		state = keyboard.nextLine();
		
		System.out.print("Enter years of employment: ");
		empyears = Integer.parseInt(keyboard.nextLine());
		System.out.print("\n");
		ll.add(new Employee(ctr,first,last,city,state,empyears));
	}
	}
	public void removeFromList(LinkedList ll, Scanner keyboard) {
		
		String name;
		int index = -1;
		
		System.out.println("\n"+ll.printEmps());
		boolean found = false;
	
		// Added so if someone enters invalid name it will ask for a different name
		while(!found){
		
			System.out.print("Enter employee to delete: ");
		
			name = keyboard.nextLine();
		
			index = ll.getIndex(name);
		
			if(index == -1) {
				System.out.print("Enter a valid employee\n");
			}
			else {
				found = true;
			}
		}
		ll.remove(index);
		System.out.print("Employee removed\n");
		
		System.out.print("\n");
		System.out.println("Employees left in list: ");
		System.out.println(ll.printEmps());
		
	}
}
