
import java.util.*;

public class ClassInstance {
    private int age;	
  
	public ClassInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge < 0){
        	this.age = 0;
        	System.out.println("Age is not valid");
        }
        else{
        	this.age = initialAge;
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		int age = this.age;
		if(age < 13){
			System.out.println("You are young");
		}
		else if( age >= 13 && age < 18){
			System.out.println("You are a teenager");
		}
		else{
			System.out.println("You are old");
		}
	}

	public void yearPasses() {
  		// Increment this person's age.
		this.age = this.age + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassInstance p = new ClassInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
