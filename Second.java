class Second {

	// This is single line comment
	/*
		This is 
		Multi line comment
	*/
	static void display(int a, int b) {  // Parameters 
				System.out.println("This is Example of function with parameter");
				int result = a + b;
				System.out.println(result);
	}

	static int square(int a) {  // Parameters 
				System.out.println("This is Example of function with return type");
				int sqr = a * a;
				return sqr;
	}
	
	public static void main(String args[]){
		// Second.display(20,25); // Arugments = 2
		int result = Second.square(2);
		System.out.println(result);
	}
}