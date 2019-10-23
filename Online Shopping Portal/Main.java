public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
	Customers Obj1=new 	Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
	Customers Obj2=new 	Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
	Suppliers Ob1=new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
	Suppliers Ob2=new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
	Obj1.displayProfileDetails();
	Obj2.displayProfileDetails();
	Ob1.displayProfileDetails();
	Ob2.displayProfileDetails();
	Obj1.editAddress("Coimbatore");
	//Users obje1=new Users();
	//obje1.editAddress("Coimbatore");
	Ob1.editAddress("Delhi");
      Obj1.placeOrder();
	//obje1.editAddress("Delhi");
	Ob1.increaseStockLevel(5);
	Ob2.increaseStockLevel(10);
    }	
}

class Users {
		//write the logic for the class Users
	
}

class Customers extends Users{
		//write the logic for the class Customers	
		public int customerId;
		public String name;
		public long mobileNumber;
		public String shippingAddress;
		public String dateOfBirth;
		public char gender;
		public String orderHistory;
		
		public Customers(int customerId,String name,long mobileNumber,String shippingAddress,String dateOfBirth,char gender,String orderHistory)
		{
		    this.customerId=customerId;
		    this.name=name;
		    this.mobileNumber=mobileNumber;
		    this.shippingAddress=shippingAddress;
		    this.dateOfBirth=dateOfBirth;
		    this.gender=gender;
		    this.orderHistory=orderHistory;
		}
		public void editAddress(String addr)
		{
		    System.out.println(name+", "+shippingAddress);
		    System.out.println(name+", "+addr);
		}
		public void placeOrder()
		{
		    System.out.println("Order placed successfully!");
		}
		public void displayProfileDetails()
		{
		    System.out.println(name+", "+mobileNumber);
		}
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
		public int supplierId;
		public String name;
		public long mobileNumber;
		public String billingAddress;
		public int itemsStock;
		public String paymentStatus;
		public float feedbackRating;
		 
		public Suppliers(int supplierId,String name,long mobileNumber,String billingAddress,int itemsStock,String paymentStatus,float feedbackRating)
		{
		    this.supplierId=supplierId;
		    this.name=name;
		    this.mobileNumber=mobileNumber;
		    this.billingAddress=billingAddress;
		    this.itemsStock=itemsStock;
		    this.paymentStatus=paymentStatus;
		    this.feedbackRating=feedbackRating;
		}
		public void editAddress(String addr)
		{
		    System.out.println(name+", "+billingAddress);
		    System.out.println(name+", "+addr);
		}
		public void increaseStockLevel(int x)
		{
		    System.out.println(name+", "+(itemsStock+x));
		    //System.out.println(name+", "+(itemsStock+10));
		}
		public void displayProfileDetails()
		{
		    System.out.println(name+", "+mobileNumber);
		}
		
}