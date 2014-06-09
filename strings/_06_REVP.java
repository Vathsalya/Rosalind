package strings;

import java.util.ArrayList;

public class _06_REVP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		
		String DNAString = FileAsStringList.get(1);
		String s = "";
		//int j = 0;
		for(int i=0;i<DNAString.length();i++){
			for(int j=i;j<DNAString.length()-3;j++){

				s = DNAString.substring(i, j+4);
				if(s.length()<=12){
					if(Rosalind_Util.getReverseComplement(s).equals(s))
						System.out.println((i+1)+" "+s.length());
				}
			}


		}

	}
}


