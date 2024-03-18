package Packages;

import java.util.Scanner;

public class IMAX_Login {

			static boolean b=true,conformation=false;
			static String user_name,pwd;
			static Booking n=new Booking();
			static Scanner s=new Scanner(System.in);
			public static void main(String[] args) throws Throwable {
				// TODO Auto-generated method stub

				
				do {
					System.out.println("\t\t\t**********Welcome to IMAX CINEMASE**********");
					System.out.println("1.Sign up\n2.Log in\n3.Log out");
					int in=s.nextInt();
					
					
				    switch (in) {
					case 1:{
						if (conformation!=true) {
							System.out.println("Enter the Email");
							user_name=s.nextLine();
							s.nextLine();
							System.out.println("Enter the password");
							pwd=s.nextLine();
							conformation=true;
							System.out.println("Account is created Sucessfully you can log-in");
						}else {
							System.out.println("Already you have the Account");
						}
						break;}

					case 2:{
						if (conformation) {
							System.out.println("Enter the Email");
							String name=s.nextLine();
							s.nextLine();
							System.out.println("Enter the password");
							String pwd1=s.nextLine();
							
							try {
								if (user_name.equals(name) && pwd.equals(pwd1)){
									userverification();
								}
								else {
									try {
									throw new Notmatching();
									} catch (Notmatching e) {
										System.out.println(e.match);
									}
								}
							}
							catch(Exception e){
								e.printStackTrace();
							}
							catch(otpiscorrect e) {
								if (user_name.equals(name) && pwd.equals(pwd1)) {
									try {
										throw new matching();
									} catch (matching e2) {
										System.out.println("login sucessfull");
										n.main(args);
									}
								}
							}
						}else {
							System.out.println("no Account create please create Account");
						}
						break;}
					case 3:{
						b=false;
						System.out.println("****************Thank you*******************");
					}
					}
					
				} while (b);
		
			}
			private static void userverification() throws InterruptedException, otpiscorrect, otpisworng {
				
				System.out.println("Enter the otp");
				Thread.sleep(1000);
				double otp=Math.random()*99999+99999;
				int sys_otp=(int)otp;
				System.out.println(sys_otp);
				int user_otp=s.nextInt();
				if (sys_otp==user_otp) {
					throw new otpiscorrect();
				} else {
					throw new otpisworng();
				}
				
				
				
			}

		}


