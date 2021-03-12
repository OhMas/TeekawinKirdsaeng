import java.util.Random;
import java.util.ArrayList;
public class transmission {
	public static ArrayList<Integer> transmit(ArrayList<Integer> arrlist, int p){
		Random rand = new Random();
		if(rand.nextInt(p)==0) {
			int position = rand.nextInt(arrlist.size());
			if(arrlist.get(position)==1) {
				arrlist.set(position, 0);
			}
			else {
				arrlist.set(position, 1);
			}
		}
		return arrlist;
	}
}
