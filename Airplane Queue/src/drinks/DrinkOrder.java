package drinks;

public class DrinkOrder {
	int seatnum=0;
	String drink;
	
	public DrinkOrder(int seatnum, String drink) {
		this.drink=drink;
		this.seatnum=seatnum;
	}
	
	public String toString() {
		return "Seat number: "+ seatnum + " Drink: "+drink;
	}
}
