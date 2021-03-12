import java.util.ArrayList;
import java.util.List;


public class CRC {
	
public static void main(String args[]) {
		
		String data = "1110010101010101010111000010";
		String divisor = "1101";
		String CRC = CRC_gen(data, divisor);
		String received = unreliable_transmission(CRC, 0.5);
		
		System.out.println("Send:\t\t" + converStringToCharList(data));
		System.out.println("CRC:\t\t" + converStringToCharList(CRC));
		System.out.println("Receive:\t" + converStringToCharList(received));
		System.out.println("Check CRC:\t" + CRC_Check(received, divisor));
	}

	public static List<Character> converStringToCharList(String string){
		List<Character> chars = new ArrayList<>();
		for (char ch:string.toCharArray()) {
			chars.add(ch);
		}
		return chars;
	}
	public static String unreliable_transmission(String inframe, double p){
		String outframe = "";
		double random = p*100;
		int i = 0;
		while(i < inframe.length())
		{
			double randomNum = Math.random() * 99 + 1;
			char current_num = inframe.charAt(i);
			if(randomNum <= random) {
				if(current_num == '0') {
					outframe += "1";
				}else {
					outframe += "0";
				}
			}else {
				outframe += current_num;
			}
		i++;
		}
		return outframe;
	}
	
	public static String div(String code, String divisor) {
		int pointer = divisor.length();
		String encoded = code.substring(0, pointer);
		String remainder = "";
		for(int i = 0; i < divisor.length(); i++) {
			if(encoded.charAt(i) == divisor.charAt(i)) {
				remainder += "0";
			}else {
				remainder += "1";
			}
		}
		while(pointer < code.length()) {
			if(remainder.charAt(0) == '0') {
				remainder = remainder.substring(1,  remainder.length());
				remainder = remainder + String.valueOf(code.charAt(pointer));
				pointer++;
			}
			encoded = remainder;
			remainder = "";
			for(int i = 0; i < divisor.length(); i++) {
				if(encoded.charAt(i) == divisor.charAt(i)) remainder += "0";
				else remainder += "1";
			}
		}
		return remainder.substring(1, remainder.length());
	}
	
	public static String CRC_gen(String data, String divisor) {
		String code = data;
		while(code.length() < (data.length() + divisor.length() - 1))
		code = code + "0";
		code = data + div(code, divisor);
		return code;
	}
	
	public static String CRC_Check(String data, String divisor) {
		if(Integer.parseInt(div(data, divisor)) == 0) return "Received valid data";
		else return "Received invalid data";
	}
	
}
