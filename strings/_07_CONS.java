package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class _07_CONS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		HashMap<String,String> FASTAFormatMap = Rosalind_Util.getFASTAFormatMap(FileAsStringList);

		int[][]arr = new int[4][8];
		for(String s:FASTAFormatMap.values()){
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='A'){
					arr[0][j]++;
				}else if(s.charAt(j)=='C')
					arr[1][j]++;
				else if(s.charAt(j)=='G')
					arr[2][j]++;
				else if(s.charAt(j)=='T')
					arr[3][j]++;
			}
		}

		String finalString="";
		for(int i=0;i<8;i++){
			int[] arrA = new int[4];
			for(int j=0;j<4;j++){
				
				arrA[j] = arr[j][i];
				//System.out.print(arrA[j]);
				
			}
			int value = getMaxIndex(arrA);
			
			finalString = finalString+getString(value);
			System.out.println();
			
		}
		System.out.println(finalString);
		
		String id="";
		for(int i=0;i<4;i++){
			if(i==0)
				id="A: ";
			if(i==1)
				id="C: ";
			if(i==2)
				id="G: ";
			if(i==3)
				id="T: ";
			System.out.print(id);
			for(int j=0;j<8;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static String getString(int value) {
		// TODO Auto-generated method stub
		String id="";
		if(value==0)
			id="A";
		if(value==1)
			id="C";
		if(value==2)
			id="G";
		if(value==3)
			id="T";
		return id;
	}

	private static int getMaxIndex(int[] arrA) {
		// TODO Auto-generated method stub
		int max=arrA[0];int index=0;
		for(int i=0;i<arrA.length;i++){
			
			if(arrA[i]>max){
				max = arrA[i];
				index = i;
			}
		}
		return index;
	}
}
