package Packages;

import java.util.Scanner;

public class payments extends Booking {
	
	static int ticket;
	static double bill;
	static Book b=new Book();
	static Bill s=new Bill();
	static Bills m=new Bills();
	
	public static void payments() throws Throwable {
		
	Scanner sc=new Scanner(System.in); 
	
	 Bill b=new Bill();
	 Tickets t=new Tickets();
	 
	ticket=sc.nextInt();
	bill=ticket*price;
	System.out.println("Total price is:" +bill);
	System.out.println("Please select the payment method\n1.Google pay\n2.phone pay");
	int payment=sc.nextInt();
 
	
    switch (payment)
	{
	 
	case 1: if(payment==1) {
		System.out.println("1.Google pay");
			 System.out.println("Please enter the amount");
			 double amount=sc.nextDouble();
			if(amount==bill)	{
				 System.out.println(" Generating the OTP");
				 double sys_otp=Math.random()*5555+6666;
				 int otp=(int) sys_otp;
				 System.out.println(otp);
				 System.out.println("Enter the OTP");
				 int OTP=sc.nextInt();
			 if(otp==OTP)	{
				 System.out.println("Processing please wait......");
				 Thread.sleep(3000);
				 s.bill();
				 m.bills();
				 System.out.println();
				 System.out.println("THANKS FOR BOOKING HAVE A NICE DAY...");
			 	break;}
			 else {
				System.out.println("OTP is Error");
			}
		}
	}
	case 2: if(payment==2) {
		System.out.println("2.Phone pay");
			 System.out.println("Please enter the amount");
			 double amount1=sc.nextDouble();
			if(amount1==bill)	{
				 System.out.println(" Generating the OTP");
				 double sys_otp=Math.random()*5555+6666;
				 int otp=(int) sys_otp;
				 System.out.println(otp);
				 System.out.println("Enter the OTP");
				 int OTP=sc.nextInt();
			 if(otp==OTP)	{
				 System.out.println("Processing please wait......");
				 Thread.sleep(3000);
				 System.out.println(b.toString());
				 System.out.println("THANKS FOR ORDERING HAVE ANICE DAY...");
				  break; }
					
			else {
				System.out.println("OTP is Error");
			}

				 
			 }
		}	

	}
}
}


