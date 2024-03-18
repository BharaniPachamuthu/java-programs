package Packages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bills {
	
	static Booking b=new Booking();
	static Tickets t=new Tickets();
	
	public static void bills() throws IOException {
		
		File f=new File("E://"+b.moviename+".txt");
		
		FileWriter fw=new FileWriter(f);
		
		fw.write(t.ticket());
		fw.flush();
		fw.close();
		
	}

}
