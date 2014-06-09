package strings;

import java.util.ArrayList;

public class FibonnaciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> FileAsStringList = Rosalind_Util.readFromFileAsList();
		//Integer.parseInt(FileAsStringList.get(0));
		System.out.println(Rosalind_Util.fibonacci(Integer.parseInt(FileAsStringList.get(0))));
	}

}
