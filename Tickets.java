package Packages;

public class Tickets extends Thread {
	
	public void run(){
		ticket();
	}
	
	static Booking b=new Booking();
	static payments p=new payments();	
	
	public static String ticket() {
		
		String res=" ";
		
		res+="Movie Name: "+b.moviename;
		res+="\nShowTime: "+b.ShowTime;
		res+="\n GST    : "+p.bill+5;
		res+="\nNo of Tickets: "+p.ticket;
		res+="\n======================";
		res+="\nTotal Price:"+p.bill;
		res+="\n======================";
		return res;		
	}	

}
