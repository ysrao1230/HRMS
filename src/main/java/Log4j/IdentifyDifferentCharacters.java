package Log4j;

public class IdentifyDifferentCharacters {

	public static void main(String[] args) {

		String value = "hahdhhdhdh#$%^&1231SHDHD";
		String characters = "";
		String numbers = "";
		String specialcharacters = "";
		int length = value.length();

		for (int i = 0; i < length; i++) {
			char a = value.charAt(i);

			if (Character.isDigit(a)) {
				numbers = numbers + a;
			} else if (Character.isAlphabetic(a)) {
				characters = characters + a;
			} else {
				specialcharacters = specialcharacters + a;
			}
		}

		System.out.println("Digits in string is: " + numbers);
		System.out.println("Alphabets in string is: " + characters);
		System.out.println("Special characters in string is: " + specialcharacters);

	}

}
