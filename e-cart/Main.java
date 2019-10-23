//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setprice(int price)
  {
    this.price=price;
  }
  public int getprice()
  {
      return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setproduct(String product)
  {
    this.product=product;
  }
  public void setquantity(int quantity)
  {
    this.quantity=quantity;
  }
  public String getproduct()
  {
    return product;
  }
  public int getquantity()
  {
    return quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
 // Item price;
  //Customer quantity;
  public Bill(int price,int quantity)
  {
    System.out.println("Total Price is : "+price*quantity);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    String pro=sc.next();
    int pr=sc.nextInt();
    int qua=sc.nextInt();
    Item i = new Item();
    i.setprice(pr);
    Customer c = new Customer();
    //c.setproduct(pro);
    c.setquantity(qua);
    //quantity=c.nextline();
    int p=i.getprice();
    int q=c.getquantity();
    Bill obj = new Bill(p,q);
    //write the logic here
    //obj.Bill();
  }
}