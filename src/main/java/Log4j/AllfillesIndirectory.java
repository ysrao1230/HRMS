package Log4j;

import java.io.File;
import java.util.Arrays;

public class AllfillesIndirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\pc\\Downloads";

		File file = new File(path);

		File Download[] = file.listFiles();
		
		int size =Download.length;
		
		System.out.println("Number of files in that folders: " +size);

		Arrays.sort(Download);

		for (File e : Download) {
			if (e.isFile()) {
				System.out.println("File is: "+e.getName());
			} else if (e.isDirectory()) {
				System.out.println("Directory is: "+e.getName());

			} else {
				System.out.println("Not known::" +e.getName());

			}
		}

	}

}
