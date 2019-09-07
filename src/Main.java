
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parent class instantiate to Detailed class (Concrete class)
		
		
		// detailed class can now call all methods
		ParentClass samp = new DetailedClass();
		System.out.print(samp.greet() );
		System.out.print(samp.run() );
		System.out.print(samp.dance() );
	}

}
// abstract class can't be instantiate
	abstract class ParentClass{
		public String greet(){
			return "Hi";
		}
		
		public abstract String dance();
		public abstract String run();
	}
	// Since Child  class failed to define run methods, 
	//Child class should be declared also a abstract class
	abstract class ChildClass extends ParentClass{
		
		//overrides method from parent class
		public String dance(){
			return "Dancing";
		}
		
	}
	
	// sample of Concrete Class
	class DetailedClass extends ChildClass{
		public String run(){
			return "Running";
		}
	}

