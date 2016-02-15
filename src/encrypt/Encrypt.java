package encrypt;

import java.math.BigInteger;

public class Encrypt {
	public static void main(String[] args) {
		Window.createWindow();
		
	}
	
	public static BigInteger textToInt(String txt, int n, int e) {
		char[] inputList = txt.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < inputList.length; i++) {
			sb.append((int)inputList[i] + 100);
			
		}
		
		BigInteger paddingScheme = new BigInteger(sb.toString());
		
		
		return new BigInteger(sb.toString());
		
	}
	
}
