package Log4j;

import java.io.IOException;

public class ReadSheetData {
	public static void main(String[] args) throws IOException {
		ReadExcelSheetData r = new ReadExcelSheetData();
		String val = r.getMapData("sathish");
		System.out.println("Value of the keyword (sathish) is- " + val);
	}
}