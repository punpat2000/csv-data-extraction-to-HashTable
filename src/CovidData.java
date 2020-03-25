import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class CovidData {
	Hashtable<String,Integer> data;
	public CovidData(String filename) {
		data = new Hashtable<String,Integer>();
		try {
			Scanner in = new Scanner(new File(filename));
			// Add your code here 
			while(in.hasNext()) {
				String[] tokens = in.nextLine().split(",");
				this.data.put(tokens[0], Integer.valueOf(tokens[1]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public int find(String d) {
		// Add your code here 
		var data = this.data.get(d);
		return data == null ? -1 : (int) data;
	}
}
