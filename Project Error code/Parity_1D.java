
public class Parity_1D {

	public static void main(String args[]) {
		
		String dataword = "1101110000101010100";
		String odd_parity = parity_gen(dataword, "Odd");
		String even_parity = parity_gen(dataword, "Even");
		String odd_received = CRC.unreliable_transmission(odd_parity, 0.1);
		String even_received = CRC.unreliable_transmission(even_parity, 0.1);
		
		System.out.println("Odd parity");
		System.out.println("Send:\t\t" + CRC.converStringToCharList(dataword));
		System.out.println("Parity gen:\t" + CRC.converStringToCharList(odd_parity));
		System.out.println("Receive:\t" + CRC.converStringToCharList(odd_received));
		System.out.println("Parity check:\t" + parity_check(dataword, "Odd"));
		System.out.println();
		System.out.println("Even parity");
		System.out.println("Send:\t\t" + CRC.converStringToCharList(dataword));
		System.out.println("Parity gen:\t" + CRC.converStringToCharList(even_parity));
		System.out.println("Receive:\t" + CRC.converStringToCharList(even_received));
		System.out.println("Parity check:\t" + parity_check(dataword, "Even"));
	}
	public static String parity_gen(String dataword, String pType){
		String pDataword = dataword;
	    int sum = 0;
	    if(pType.equalsIgnoreCase("even")) {
	    	for(int i =0; i<pDataword.length();i++) {
			  sum += Integer.parseInt(pDataword.charAt(i)+"");
			}
			if(sum%2 == 0) {
				pDataword += "0";
			}else {
				pDataword += "1";
			}
	    }else if(pType.equalsIgnoreCase("odd")) {
	    	for(int i =0; i<pDataword.length();i++) {
				 sum += Integer.parseInt(pDataword.charAt(i)+"");
			}
			if(sum%2 != 0) {
				pDataword += "0";
			}else {
				pDataword += "1";
			}
	    }else{
	    	return "Invalid Parameter";
	    }
		return pDataword;
	}
	
	public static String parity_check(String dataword, String pType){
		String pDataword = dataword;
	    int sum = 0;
	    if(pType.equalsIgnoreCase("even")) {
	    	for(int i =0; i<pDataword.length();i++) {
			  sum += Integer.parseInt(pDataword.charAt(i)+"");
			}
			if(sum%2 == 0) {
				return ("Received valid dataword");
			}else {
				return ("Received invalid dataword");
			}
	    }else if(pType.equalsIgnoreCase("odd")) {
	    	for(int i =0; i<pDataword.length();i++) {
				 sum += Integer.parseInt(pDataword.charAt(i)+"");
			}
			if(sum%2 != 0) {
				return ("Received valid dataword");
			}else {
				return ("Received invalid dataword");
			}
	    }else{
	    	return ("Invalid parameter");
	    }
	}

}
