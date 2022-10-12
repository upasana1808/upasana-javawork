package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			//open the file if exist or create new 
			Writer w=new FileWriter("upasana.txt",true);
			String content="Kevin is helping upasana";
			w.write(content);//does the writing
			w.close();//close the file
			System.out.println("file written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
