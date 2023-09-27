import student.NoTechStudent;
import student.TechStudent;

public class Student {

	public static void main(String[] args) {
		TechStudent Pedro = new TechStudent();
		System.out.println("Oi, eu sou o Pedro!");
		Pedro.eat();
		Pedro.move();

		NoTechStudent Maria = new NoTechStudent();
		System.out.println("Oi, eu sou Maria");
		Maria.eat();
		Maria.move();
		
	}
    
}
