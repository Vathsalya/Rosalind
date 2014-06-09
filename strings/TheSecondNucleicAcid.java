package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TheSecondNucleicAcid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Charset charset = Charset.forName("US-ASCII");
		Path file = Paths.get("C:/Users/Vathsalya/workspace/Rosalind/src/strings/dataset");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    String s = "";
		    while ((line = reader.readLine()) != null) {
		        s = line;
		    }
		    
		s = s.replace('T', 'U');
		 System.out.println(s);
		  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
