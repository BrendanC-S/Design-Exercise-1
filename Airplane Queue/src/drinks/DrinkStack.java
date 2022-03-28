package drinks;
import java.util.Stack;

public class DrinkStack {
	
	 Stack<DrinkOrder> orderStack = new Stack<DrinkOrder>();
	 
	 public void addOrder(DrinkOrder o) {
		 orderStack.push(o);
	 }
	 
	 public void displayOrders() {
		 for(int i=0; i<10; i+=1) {
			 if (!orderStack.empty()) {
				 System.out.println(orderStack.pop());
			 } else {
				 System.out.println("No more Orders");
				 return;
			 }
		 }
	 }
}
