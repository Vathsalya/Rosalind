package alignment;

import java.util.ArrayList;

import strings.Rosalind_Util;

public class _01_HAMM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		String s1 = FileAsStringList.get(0);
		String s2 = FileAsStringList.get(1);

	/*	int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s1.charAt(i))
				count++;	
		}*/
		System.out.println(Rosalind_Util.computeHammingDistance(s1, s2));
	}

}
