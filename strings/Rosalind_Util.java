package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Rosalind_Util {

	public static ArrayList<String> readFromFileAsList(){
		ArrayList<String> FileAsStringList = new ArrayList<>(); 
		Charset charset = Charset.forName("US-ASCII");
		Path file = Paths.get("C:/Users/Vathsalya/workspace/Rosalind/src/strings/dataset");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				//DNAString = line;
				FileAsStringList.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return FileAsStringList;
	}
	
	public static ArrayList<String> readFromFileAsList(String s){
		ArrayList<String> FileAsStringList = new ArrayList<>(); 
		Charset charset = Charset.forName("US-ASCII");
		Path file = Paths.get(s);
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				//DNAString = line;
				FileAsStringList.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return FileAsStringList;
	}

	public static HashMap<String,String> getFASTAFormatMap(ArrayList<String> FileAsStringList){

		String id="";
		HashMap <String,String> FASTAFormatMap = new HashMap<>();
		StringBuffer DNAString = new StringBuffer();
		for(String s : FileAsStringList)
		{
			if(s.startsWith(">Rosalind"))
			{
				if(DNAString.length()!=0)
				{
					FASTAFormatMap.put(id, DNAString.toString());
					DNAString = new StringBuffer();
					//	DNAString.delete(0, DNAString.length()-1);
				}		
				id  = s.replace(">Rosalind_", "") ; 		
			}else{
				DNAString.append(s);
			} 	
		}
		if(DNAString.length()!=0)
		{
			FASTAFormatMap.put(id, DNAString.toString());
			DNAString.delete(0, DNAString.length()-1);
		}

		return FASTAFormatMap;

	}
	public static int computeGC_count(String s){
		int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==('G')||s.charAt(i)==('C'))
				count++;
		}
		return count;
	}

	public static double computeGC_content(String DNAString){
		double GC_count = computeGC_count(DNAString);
		return ((GC_count * 100)/DNAString.length());
	}

	public static String getReverseComplement(String s){
		StringBuffer finalString=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)=='T')
				finalString.append('A');

			if(s.charAt(i)=='G')
				finalString.append('C');

			if(s.charAt(i)=='C')
				finalString.append('G');

			if(s.charAt(i)=='A')
				finalString.append('T');

		}
		return finalString.toString();
	}
	public static int fibonacci(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return(fibonacci(n-1)+fibonacci(n-2));
	}

	public static int getBinarySearchIndex(int searchElement, int low,
			int high, int[] sortedIntArray) {
		// TODO Auto-generated method stub
		if(high<low)
			return -1;
		else{
			int mid = (low+high)/2;
			if(searchElement > sortedIntArray[mid])
				return getBinarySearchIndex(searchElement,mid+1,
						high, sortedIntArray);
			else if(searchElement < sortedIntArray[mid])
				return getBinarySearchIndex(searchElement,low,
						mid-1, sortedIntArray);
			else if (searchElement == sortedIntArray[mid])
				return mid;

		}
		return -1;
	}
	
	public static int computeHammingDistance(String s1,String s2){
		int count = 0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				count++;	
		}
		return count;
	}
	
	public static String[] getSubstrings(String s){
		String[] substrings = null;
		return substrings;
	}
}
