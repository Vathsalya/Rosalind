package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FindingMotifinDNA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		String DNAString = FileAsStringList.get(0);
		String subString = FileAsStringList.get(1);

		int index=0;
		while(index!=-1){
			index = (DNAString.indexOf(subString,index+1));
			if(index==-1)
				return;
			System.out.print(index+1+" ");
			//System.out.print("\t");
		}

	}

}
