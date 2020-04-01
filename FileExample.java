package Ex1;
import java.io.File;
public class FileExample {
				public static void main(String[] args)
				{
					File file = new File ("E:\\kgf.txt"); //creating instances
				    boolean c = file.exists(); 
				    System.out.println(c);  // showing the boolean value does file exist or not 
					System.out.println(file.exists()); // printing the function of file existing
				
			
				}
}
