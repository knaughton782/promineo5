package weekFivePractice;

public class Classes {
	
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder();
		//class                instance of stringbuilder class
		//the new instance becomes our object
		//like house is instance of blueprint
		
		StringBuilder name2 = new StringBuilder();
								//This is a constructor
								//overloaded constructor has paraments
		
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-1234";
		
		student1.introduce();
		
		Student student2 = new Student("Sam", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Thom", "Riddle", "489-908-9870", 11);
		student3.introduce();
		
		
	}

}
