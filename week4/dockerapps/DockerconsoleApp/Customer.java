public class Customer{

  private String name;
  
  
   Customer(String name) {
        this.name=name;
   }

  void displayCustomerName() {
     System.out.println(name);
     
  }
public static void main(String args[]) {
     Customer c=new Customer("VerizonUSer");
     c.displayCustomerName();
     
}
}