package ExceptionRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileNotFondExceptn {
	public static void main(String[] args)throws IOException {
		try {
			File f = new File("C:\\Users\\PRAVEENRAJ\\Desktop\\today.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while((temp=fr.read())!=-1) {
				System.out.println((char) (temp));
			}
		}
			catch (FileNotFoundException fne) {
				System.out.println("File  Not found");
			}
		}

}
