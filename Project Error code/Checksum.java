import java.util.ArrayList;
import java.util.List;



public class Checksum 
{

public static void main(String args[]) {
		
		String dataword = "1110010101010101010111000010";
		int words = 8;
		int blocks = 4;
		String send = Checksum_gen(dataword, words, blocks);
		String received = CRC.unreliable_transmission(send, 0.1);
		
		System.out.println("Send:\t\t" + CRC.converStringToCharList(dataword));
		System.out.println("Checksum generate:\t" + CRC.converStringToCharList(send));
		System.out.println("Data frame received:\t" + CRC.converStringToCharList(received));
		System.out.println("Checksum check:\t" + Checksum_check(received, words, blocks));
	}

	public static List<String> convertStringToDatawords(String stringInput, int word, int num_blocks){
		int blocknum = 0;
		int pointer1 = 0;
		int pointer2 = word;
		String temp = "";
		List<String> newInfo = new ArrayList<>();
		if(stringInput.length() >= word) {
			while(blocknum < num_blocks) {
				if(pointer2 <= stringInput.length()) {
					temp = stringInput.substring(pointer1, pointer2);
					newInfo.add(temp);
					pointer1 += word;
					pointer2 += word;
					blocknum++;
				}else {
					break;
				}
			}
		}
		return newInfo;
	}
		public static String padString(String stringInput, int word) {
			String paddedString = stringInput;
		while((paddedString.length() % word) != 0) {
			paddedString = "0" + paddedString;
		}
		return paddedString;
	}
	
	public static String stringBinary(String stringInput) {
		String complementNum = "";
		for(int i = 0; i < stringInput.length(); i++) {
			if(stringInput.charAt(i) == '0') {
				complementNum = complementNum + "1";
			}else {
				complementNum = complementNum + "0";
			}
		}
		return complementNum;
	}
	
	public static String totalSum(String stringInput, int word){
		
		List<String> sums = new ArrayList<String>();
		String paddedString = padString(stringInput, word);
		String left, right;
		int Sum = 0;
		int pointer_l = paddedString.length() - word;
		int pointer_r = paddedString.length();
		
		left = paddedString.substring(0, pointer_l);
		right = paddedString.substring(pointer_l, pointer_r);
		sums.add(left);
		sums.add(right);
		Sum = Integer.parseInt(left, 2) + Integer.parseInt(right, 2);
//		System.out.println(sums);
//		System.out.println(lrSum);
		
		return Integer.toBinaryString(Sum);
	}
	
	public static String Checksum_gen(String datawords, int word, int num_blocks){
		
		List<String> words = convertStringToDatawords(datawords, word, num_blocks);
		List<Integer> number = new ArrayList<>();
		int sum_dec = 0;
		int temp;
		String sum_binary = "";
		String checksum = "";
		String outString = "";
		
		for(String i: words) {
			temp = Integer.parseInt(i, 2);
			number.add(temp);
			sum_dec += temp;
		}
//		System.out.println(number);
//		System.out.println(sum_dec);

		
		sum_binary = Integer.toBinaryString(sum_dec);
//		System.out.println(sum_binary);
		
		while(sum_binary.length() > word) {
			sum_binary = totalSum(sum_binary, word);
		}
		
		sum_binary = padString(sum_binary, word);
		checksum = stringBinary(sum_binary);
//		System.out.println("Checksum: " + checksum);
		
		for(String i: words) {
			outString += i;
		}
		outString += checksum;
		
		return outString;
	}
	
	public static String Checksum_check(String datawords, int word, int num_blocks) {
		
		List<String> words = convertStringToDatawords(datawords, word, num_blocks);
		List<Integer> number = new ArrayList<>();
		int sum_dec = 0;
		int temp;
		String sum_binary = "";
		String rec_checksum = datawords.substring(datawords.length() - word, datawords.length());
		String checksum = "";
		System.out.println("Actual Checksum:\t" + rec_checksum);
//		words.add(rec_checksum);
//		System.out.println(words);
		
		for(String i: words) {
			temp = Integer.parseInt(i, 2);
			number.add(temp);
			sum_dec += temp;
		}
//		System.out.println(number);
//		System.out.println(sum_dec);
		
		sum_binary = Integer.toBinaryString(sum_dec);
//		System.out.println(sum_binary);
		
		while(sum_binary.length() > word) {
			sum_binary = totalSum(sum_binary, word);
		}
		
		sum_binary = padString(sum_binary, word);
		checksum = stringBinary(sum_binary);
		System.out.println("Calculated Checksum:\t" + checksum);
		sum_dec = Integer.parseInt(checksum);
//		System.out.println(sum_dec);
		
		if(sum_dec == 0) return "Recieved valid datawords";
		else return "Recieved invalid datawords";
	}
	
}
