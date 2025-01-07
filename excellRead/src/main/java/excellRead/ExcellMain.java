package excellRead;

import java.io.IOException;

public class ExcellMain {
	public static void main(String[] args) throws IOException {
		String name =excell.readStringData(2,0);
		System.out.println("Name :"+ "\t"+name);
		String id= excell.readIntegerData(2, 1);
		System.out.println("id :"+"\t"+ id);
		}

}
