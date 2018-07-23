package weekFivePractice;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sally");
		System.out.println(student.getFirstName());
		//poor practice - do encapsulation instead using access modifiers
		
		/*
		 * Access modifiers:
		 * 		public: 		accessible everywhere
		 * 		private:		only accessible within the class itself 
		 * 		protected:		only accessible within the class, other classes
		 * 						within the same package, and all sub classes
		 * 		no modifier: 	same as protected except for not accessible in a
		 * 						subclass in a different package
		 */
	}

}
