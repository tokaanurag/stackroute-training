package an;
import java.io.File;
import java.util.Date;

public class Modified {
	 public static void main(String[] args) {
	       File file = new File("/home/anurag.choudhary/eclipse-workspace/javap/src/test.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	     }
	

}
