package Practice1;

public class Practiceinheritance extends Practiceabstraction {
	
	
	
	public void add (int a, int b) {
		int sum  = (a+b);
		System.out.println(sum);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Practiceabstraction p1 = new Practiceabstraction();
		p1.add (50,5);
		p1.multiply (50,5,6);
		p1.add ( 20,20);
		p1.add (10,60);
		
		Practicedivide p2 = new Practicedivide ();
		p2.divide (50,5);
		
	}

}
