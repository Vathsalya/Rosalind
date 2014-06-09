package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class CountingDNANucleotides {

	public static void main(String[] args) {
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(String s:FileAsStringList){
			char[] str = s.toCharArray();
			int count = 0;
			for(char c : str){
				if(hashMap.containsKey(c)){
					hashMap.put(c, (hashMap.get(c))+1);
				}else{
					hashMap.put(c, 1);
				}
			}
			System.out.println(hashMap.get('A')+" "+hashMap.get('C')+" "+hashMap.get('G')+" "+hashMap.get('T'));
		}
	}
}
