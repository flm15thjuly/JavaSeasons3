package filesandfolders;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\FLM15thJuly\\jars\\abc.txt");
		System.out.println(f1.createNewFile());

	}

}
