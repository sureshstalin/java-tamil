import fruits.*; // you can access all class exist in the fruits package;
import vegetables.Brinjal;

class Price {

// Since this class does not belongs to any package , it consider as default package.
	public static void main(String args[]) {
			int mangoPrice = Mango.getMangoPrice();
			System.out.println("Mango Price is " + mangoPrice); // Mango Price is 30
			int brinjalPrice = Brinjal.getBrinjalPrice();
			System.out.println("Brinjal Price is " + brinjalPrice); // Brinjal Price is Price is 45
			int penPrice =  stationery.Pen.getPenPrice(); // package-name.classname.methodname
			System.out.println("Pen Price is " + penPrice);
			
	}
	

}