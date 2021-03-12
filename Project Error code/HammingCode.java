
public class HammingCode {
	
public static void main(String args[]) {
		
		String dataword = "1110010101010101010111000010";
		String sendWord = HammingCode_gen(dataword);
		String received = CRC.unreliable_transmission(sendWord, 0.1);
		
		System.out.println("Send:\t\t" + CRC.converStringToCharList(dataword));
		System.out.println("Hamming gen:\t" + CRC.converStringToCharList(sendWord));
		System.out.println("Received:\t" + CRC.converStringToCharList(received));
		System.out.println("Hamming check:\t" + HammingCode_check(received, getParityCount(dataword)));
	}

	public static int getParityCount(String dataword) {
		int i = 0;
		int count = 0;
		while(i<dataword.length()) {
			if(Math.pow(2, count) == i+count+1) {
				count++;
			}else {
				i++;
			}
		}
		return count;
	}
	
	public static int getParity(int list[], int power) {
		int parity = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] != 2) {
				int k = i + 1;
				String s = Integer.toBinaryString(k);
				int x = ((Integer.parseInt(s))/((int)Math.pow(10, power)))%10;
				if(x == 1) {
					if(list[i] == 1) {
						parity = (parity + 1)%2;
					}
				}
			}
		}
		return parity;
	}
	
	public static String HammingCode_gen(String dataword) {
		
		int[] list;
		int i = 0, j = 0, k = 0;
		int count = 0;
		String hamming_code = "";
		
		while(i<dataword.length()) {
			if(Math.pow(2, count) == i+count+1) {
				count++;
			}else {
				i++;
			}
		}
		
		list = new int[dataword.length() + count];
		
		for(i = 1; i < list.length; i++) {
			if(Math.pow(2, j) == i) {
				list[i-1] = 2;
				j++;
			}else {
				list[k+j] = Integer.parseInt(Character.toString(dataword.charAt(k++)));
			}
		}
		
//		System.out.println(Arrays.toString(list));
		
		for(i = 0; i < count; i++) {
			list[((int)Math.pow(2,  i))-1] = getParity(list, i);
		}
		
		for(i = 0; i < list.length; i++) {
			hamming_code += Integer.toString(list[i]);
		}
		
//		System.out.println(hamming_code);
		return hamming_code;
	}
	
	public static String HammingCode_check(String dataword, int count) {
		int power;
		int parity[] = new int[count];
		
		String syndrome = "";
		
		for(power=0;power<count;power++) {
			for(int i=0; i<dataword.length();i++) {
				int k = i+1;
				String s = Integer.toBinaryString(k);
				int bit = ((Integer.parseInt(s))/((int) Math.pow(10, power)))%10;
				
				if(bit==1) {
					if(Integer.parseInt(Character.toString(dataword.charAt(i))) == 1) {
						parity[power] = (parity[power]+1)%2;
					}
				}
			}
			syndrome = parity[power] + syndrome;
		}
		
		int error_location = Integer.parseInt(syndrome,2);
		if(error_location != 0) {
			return "Error is at location: " + error_location;
		}else {
			return "There is no error in the received data";
		}
	}
	
	
}
