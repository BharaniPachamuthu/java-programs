package Packages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Bill {
	
	static FileWriter fw;
	static Booking b=new Booking();
	static Tickets t=new Tickets();

	public static void bill() throws Throwable {
		// TODO Auto-generated method stub
		
		File f=new File("E://"+b.moviename+".txt");
		
		if (f.createNewFile()) {
			System.out.println("File Name:"+f.getName()+"is created sucessfully");
		}else {
			System.out.println("File is Already Exits...");
		}
				
	}
	
	

}
