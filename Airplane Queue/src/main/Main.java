package main;

import drinks.DrinkOrder;
import drinks.DrinkStack;

public class Main {
	public static void main(String[] args){
		DrinkStack flight128=new DrinkStack();
	
		for(int i=18;i>0;i--) {
			DrinkOrder o= new DrinkOrder(i,"coke"+i);
			flight128.addOrder(o);
		}
		flight128.displayOrders();
		flight128.displayOrders();
	}
}
