package divideandconquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import strings.Rosalind_Util;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		int _arrayLength = Integer.parseInt(FileAsStringList.get(0));
		int _numSearchElements = Integer.parseInt(FileAsStringList.get(1));
		String s = FileAsStringList.get(2);
		String[] sortedArray = s.split(" ");
		String str = FileAsStringList.get(3);
		String[] searchElements = str.split(" ");
		
		int[] sortedIntArray = new int[_arrayLength];
		int index=0;
		for(String ele:sortedArray){
			sortedIntArray[index] = Integer.parseInt(ele);
			index++;
		}
		int in=0;
		String ss="";
		for(int i =0;i<_numSearchElements;i++){
			in = Rosalind_Util.getBinarySearchIndex(Integer.parseInt(searchElements[i]),0,_arrayLength-1,sortedIntArray);
			if(in==-1)
				in = -1;
			else
				in = in+1;
			
				System.out.println(in);
			
			 ss = ss + in+" ";
			
		}
		 System.out.println(ss);
		 
		Charset charset = Charset.forName("US-ASCII");
		Path file = Paths.get("C:/Users/Vathsalya/workspace/Rosalind/src/strings/dataset1");
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
			//writer.write(in+"");
			writer.write(ss);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.err.format("IOException: %s%n", e);
		}
		
		
	}

}
