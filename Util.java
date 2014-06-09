import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Util {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> readFromFileAndReturnAsStringList(String Filename)
	{
		ArrayList<String> fileContent = new ArrayList<String>();
		try{

			FileInputStream fstream = new FileInputStream(Filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			while ((strLine = br.readLine()) != null)   {
				fileContent.add(strLine);					//read the entire file into an arraylist of strings, each line of file is one corresponding element in the arraylist
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}	

		//	for(int i = 0; i < fileContent.size();i++)
		//	System.out.println(fileContent.get(i));


		return fileContent;
	}

}
