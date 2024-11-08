package esakkiganesh;
import java.util.ArrayList;

public class StrToValidInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Words and 987";
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				continue;
			}
			if(Character.isDigit(s.charAt(i))) {
				if(i == 0 && s.charAt(i) == '0') {
					break;
				}
				else  {
				list.add(s.charAt(i));	}
			}
			if(!Character.isDigit(s.charAt(i)))
			{
				if(s.charAt(i) == '-') {
					list.add(s.charAt(i));
				}
				else {
				break; }
			}
		}
		if(list.isEmpty()) {
			list.add('0'); }
		System.out.print(list);

	}

}
