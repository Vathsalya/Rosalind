package strings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComputingGCContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		HashMap<String,String> FASTAFormatMap = Rosalind_Util.getFASTAFormatMap(FileAsStringList);

		double max_GC=0.0;
		String id="";
		for (Map.Entry<String,String> entry : FASTAFormatMap.entrySet()) {
			double result=0.0;
			result = Rosalind_Util.computeGC_content(entry.getValue());
			if(result>max_GC){
				id = "Rosalind_"+entry.getKey();
				max_GC = result;
			}
		}
		System.out.println(id);
		System.out.println(max_GC);
	}

}
