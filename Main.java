import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("EmpData.txt");
		Scanner inputFile = null;
		Scanner keyboard = new Scanner(System.in);
		
		LinkedList Emp = new LinkedList();
		
		inputFile = new Scanner(file);
		
		while (inputFile.hasNextLine()) {
			String[] tkn = inputFile.nextLine().split(";");
			Emp.add(new Employee(Integer.parseInt(tkn[0]), tkn[1],tkn[2],tkn[3],tkn[4],(Integer.parseInt(tkn[5]))));
		}
		int option = 0;
		while (option != 4) {
			System.out.println("\nEmployee Maintenance System: ");
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Print Employee Information");
			System.out.println("4. Exit");
			System.out.print("Enter option: ");
			option =Integer.parseInt(keyboard.nextLine());
				
			if(option == 1) {
			Emp.addToList(Emp, keyboard);
				
			}
			if(option == 2) {
			Emp.removeFromList(Emp, keyboard);
				
			}
			if(option == 3){
			System.out.print(Emp);
			System.out.print("\n");
				
			}
			if(option ==4) {
				keyboard.close();
				inputFile.close();
				System.exit(0);
			}	
		}
	}
}
