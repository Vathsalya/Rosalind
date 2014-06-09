package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import strings.Rosalind_Util;

public class PROT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		ArrayList<String> data = Rosalind_Util.readFromFileAsList("C:/Users/Vathsalya/workspace/Rosalind/src/misc/PROT");
		for(String s:data){
			String line[] = s.split(" ");
			map.put(line[0], line[1]);
		}
		
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		for(String s:FileAsStringList){
			String DNAString = s;
			String finalString="";
			for(int i=0;i<DNAString.length();i=i+3){
				String ss = DNAString.substring(i, i+3);
				System.out.println(ss);
				for(Map.Entry<String,String>entry:map.entrySet()){
					System.out.println("--"+entry.getKey());
					if(ss.equals(entry.getKey())){
						if(entry.getValue().equals("Stop"))
							finalString = finalString + "";	
						else
						finalString = finalString + entry.getValue();
					}
				}
			}
			System.out.println(finalString);
		}
		
		
	}

}
