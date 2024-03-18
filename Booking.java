package Packages;

import java.util.Scanner;

public class Booking {
	
	static short price;
	static String moviename;
	static String ShowTime;
	static Scanner sc=new Scanner(System.in);

	
	public static void main(String[] args) throws Throwable {
		
		
				do {
				System.out.println("\t\t\t\t\t\t\t=======Selecte the Screen======");
				System.out.println("\t\t\tScreen-1\n1.Leo 2.Vikram 3.Jailer\n\t\t\tScreen-2\n1.Captain America 2.Iron Man 3.Avengers ENDGAME");
				System.out.println("\t\t\tScreen-3\n1.Avatar Way of Water 2.Jungel Curse 3.Spider Man");
				
				int num=sc.nextInt();
				
				switch (num) {
				case 1: {
					System.out.println("\t\t\tScreen-1\n1.Leo\n2.Vikram\n3.Jailer"); 
					int num1=sc.nextInt();
					if (num1==1) {
						System.out.println(moviename="Leo");
						price=250;
					}
					if (num1==2) {
						System.out.println(moviename="Vikram");
						price=200;
					}
					if (num1==3) {
						System.out.println(moviename="Jailer");
						price=220;
					}
					break;}
				case 2:{
					System.out.println("\t\t\tScreen-2\n1.Captain America\n2.Iron Man\n3.Avengers ENDGAME");
					int num2=sc.nextInt();
					if (num2==1) {
						System.out.println(moviename="Captain America");
						price=350;
					}
					if (num2==2) {
						System.out.println(moviename="Iron Man");
						price=300;
					}
					if (num2==3) {
						System.out.println(moviename="Avengers Endgame");
						price=320;
					}
					break;}
				case 3:{
					System.out.println("\t\t\tScreen-3\n1.Avatar Way of Water\n2.Jungel Curse\n3.Spider Man");
					int num3=sc.nextInt();
					if (num3==1) {
						System.out.println(moviename="Avatar Way of Water");
						price=200;
					}
					if (num3==2) {
						System.out.println(moviename="Jungle Curse");
						price=250;
					}
					if (num3==3) {
						System.out.println(moviename="Spider Man");
						price=280;
					}
					break;}	
			}		
				
				System.out.println(moviename+"  Which Time show Would you preffer ");
				System.out.println("1.Morning:"+(ShowTime="10:00Am")+"\n2.After Noon:"+(ShowTime="12:00PM")+"\n3.Night:"+(ShowTime=" 09:00PM"));
				int n=sc.nextInt();
				if(n==1){
					System.out.println("1.Morning:"+(ShowTime="10:00Am"));}
				if(n==2){
					System.out.println("2.After Noon:"+(ShowTime="12:00PM"));}
				if(n==3){
					System.out.println("3.Night:"+(ShowTime=" 09:00PM"));};
				
				System.out.println("Number of Tickets");
				payments p=new payments();
				p.payments();
		
				}while(true);
				
		}
	}
