package uni1;

public class Program1 {
	public static void main(String[]args) {

		String firstName = "John";
		String lastName = "Doe";

		//Generate email
		String generate = (firstName.substring(0,1)+lastName+"@test.edu");
		String email = generate.toLowerCase();
	
		System.out.println(email);
	}	

}
