public class ShopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax = 0.2, total = 0.0;
		
		System.out.println("Welcome to Duke Choice Shop");
		
		Customer c1 = new Customer();
		c1.name = "Pinky";
		c1.size = "S";
		
		System.out.println("Customer is " + c1.name );
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		
		item2.description = "Orange T-shirt";
		item1.price = 10.5;
		item1.size = "S";
		
		System.out.println("Item 1" + "," +item1.description + "," + item1.price + "," + item1.size);
		System.out.println("Item 2" + "," +item2.description + "," + item2.price + "," + item2.size);
		
		 total = ("item1.price + item2.price *2 ) * (1 + tax);"
				 
				 System.out.println("total = " + total);
				 
				 int measurement = 3;
				 switch (measurement) {
				 case 1, 2 ,3:
					 c1.size = "S";
				 break;
				 case 4, 5, 6:
					 c1.size ="M";
				 case 7, 8, 9:
					 c1.size "L";
				 break;
				 default:
					 c1.size = "X";
				 }

	}

}
