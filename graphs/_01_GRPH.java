package graphs;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import strings.Rosalind_Util;

public class _01_GRPH {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Charset charset = Charset.forName("US-ASCII");
		Path file = Paths.get("C:/Users/Vathsalya/workspace/Rosalind/src/strings/dataset1");
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
			//writer.write(in+"");

			ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
			HashMap<String,String> FASTAFormatMap = Rosalind_Util.getFASTAFormatMap(FileAsStringList);
			ArrayList<String> keys = new ArrayList<>();
			ArrayList<String> values = new ArrayList<>();
			for(Map.Entry<String, String> entry : FASTAFormatMap.entrySet()){
				keys.add(entry.getKey());
				values.add(entry.getValue());
			}
			for(int i=0;i<values.size();i++){
				String s = values.get(i);
				for(int j=i+1;j<values.size();j++){
					//if(i!=j)
					{
						
						String s1 = values.get(j);
						//if(s!=s1)
						if((s.charAt(s.length()-1)==s1.charAt(0))||s.charAt(0)==s1.charAt(s1.length()-1)){

							System.out.println("Rosalind_"+keys.get(i)+" Rosalind_"+keys.get(j));
						}
					}
				}


			}
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.format("IOException: %s%n", e);
		}
	}

}
