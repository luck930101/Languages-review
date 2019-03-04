
public class Subaru extends Car {
	
	public String name = "Subaru";
	
	public Subaru(){
		System.out.println("I have a subaru!");
	}
	
	public void run(){
		System.out.println("My subaru is running!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.run();
		System.out.println(mycar.name);
		System.out.println("***************");
		
		Subaru mysubaru = new Subaru();
		mysubaru.run();
		System.out.println(mysubaru.name);
		System.out.println("***************");
		
		Car mycar2 = new Subaru();
		mycar2.run();
		System.out.println(mycar2.name);
	}

}
