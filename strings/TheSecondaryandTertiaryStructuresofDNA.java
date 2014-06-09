package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TheSecondaryandTertiaryStructuresofDNA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		String DNAString="";
		for(String s:FileAsStringList){
			DNAString=s;
		
		}
		System.out.println(Rosalind_Util.getReverseComplement(DNAString));
	}

}
