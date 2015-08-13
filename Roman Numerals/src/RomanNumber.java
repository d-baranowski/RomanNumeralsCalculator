import java.util.Comparator;

public class RomanNumber implements Comparable<RomanNumber>, Comparator<RomanNumber>{
	char number;
	int value;
	static char[] order = {'I','V','X','L','C','D','M'};
	
	public RomanNumber(char number){
		this.number = number;
	}
	@Override
	public int compareTo(RomanNumber o) {
		int comparedValue;
		
		for (int i = 0; i < order.length; i++){
			if (o.number == order[i]){
				o.value = i;
			}
			
			if (this.number == order[i]){
				this.value = i;
			}
		}
			
		return o.value - this.value;
	}
	
	@Override
	public int compare(RomanNumber o1, RomanNumber o2) {
		int comparedValue;
		
		for (int i = 0; i < order.length; i++){
			if (o2.number == order[i]){
				o2.value = i;
			}
			
			if (o1.number == order[i]){
				o1.value = i;
			}
		}
			
		return o2.value - o1.value;
	}
	
	public String toString(){
		return number+"";	
	}

}
