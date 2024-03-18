package Packages;

public class Book {
	
	Booking b=new Booking();
	payments p=new payments();
	
	
	String MoiveName=b.moviename;
	int Numoftickets=p.ticket;
	double price=p.price;
	double Totalprice=p.bill;
	
		

	@Override
	public String toString() {
		return "Book [MoiveName=" + MoiveName + ", Numoftickets=" + Numoftickets + ", price=" + price + ", Totalprice="
				+ Totalprice + "]";
	}
	
	
	

}
