//interface program
interface Cognizant{             
void employee_Bio();

}
public class Sneha implements Cognizant {

	public void employee_Bio() {

		System.out.println("employee name:" + "Sneha");
		System.out.println("employee Id:" + "1244");
		System.out.println("employee salary:" + "100k");

	}

	public static void main(String[] args) {
		Sneha obj = new Sneha();

		obj.employee_Bio();
	}

}




