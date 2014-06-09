package strings;

public class LCSM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rosalind";
		String s2 ="Rosalind";
		
		for(int i=0;i<=s1.length();i++){
			for(int j = i+1;j<=s1.length();j++)
			{
				String sub = s1.substring(i, j);
				String sub1 = s2.substring(i,j);
				if(sub1==sub)
				System.out.println(sub);
				
			}
		}
	}

}
