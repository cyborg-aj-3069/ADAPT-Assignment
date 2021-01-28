import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost(int dessert);
}
class Candy extends DesertItem {
 int candies = 0;
    public int addCandies(int c){
     candies = candies + c;
		return candies;
    }
    
    public int getCost(int c){
        int total_cost = c * 60;
		return total_cost;
    }
}
class Cookie extends DesertItem {
    private int cookies=0;
    public int addCookies(int cookies){
        return this.cookies += cookies;
    }
    
    public int getCost(int cookies){
        int total_cost = cookies * 70;
		return total_cost;
    }

}
class IceCream extends DesertItem {
    private int iceCream=0;
    public int addIceCreams(int iceCream){
        return this.iceCream += iceCream;
    }
  
    public int getCost(int iceCream){
        return iceCream * 10;
    }
}


public class Assignment2Q7 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Assignment2Q7 obj = new Assignment2Q7();
        obj.selectRoles();
    }
    private void selectRoles(){
        System.out.println("Enter role name: ");
        String role = sc.nextLine();
        roles(role);
    }
    private void roles(String role){
        if(role.toLowerCase() == "owner"){
            addItems();

        }
        else if (role.toLowerCase() == "customer"){
            placeOrder();
        }
    }
    int quant=0;
    private void addItems() {
        System.out.println("Enter the quantity of Items : ");
        quant = sc.nextInt();
        addItemsOperation(quant);
    }
    private void addItemsOperation(int quant) {
        int quantity = quant;
        return quantity;
    }
    int num =0;
    private void placeOrder() {
        
        System.out.println("Enter quantity of the order: ");
         num = sc.nextInt();
        placeOrderOperation(num);
    }
    private void placeOrderOperation(int number) {
        int num = number;
        return num;
}
}
