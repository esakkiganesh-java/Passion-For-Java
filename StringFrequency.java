package esakkiganesh;
import java.util.ArrayList;
public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = new ArrayList<>();
		ArrayList<Integer>   freq = new ArrayList<>();
		String s = "abccc" ;
		int[] arr = new int[s.length()];
		for( int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		System.out.println(list);
		Outerloop:
		for(int i = 0; i < list.size()-1; i++)
		{
			for(int j = i + 1; j < list.size(); j++)
			{
				if( list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					break Outerloop;
				}
			}
		}
		System.out.println(list);
		for(int i = 0; i < list.size(); i++)
		{
			int count = 1;
			for(int j = i+1; j < list.size(); j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					arr[j] = -1;
				}
			}
			if(arr[i] != -1)
			{
				arr[i] = count;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			if(arr[i] != 0) {
				freq.add(arr[i]);
			}
		}
		System.out.println();
		System.out.println(freq);
		int count1 = 0;
        for( int i = 0; i < freq.size(); i++)
        {
        	if(!freq.get(i).equals(1))
        	{
        		System.out.print("No");
        		break;
        	}
        	else {
                count1++;
        	}
        }
        if(count1 == list.size())
        {
        	System.out.print("Yes");
        }
		

	}

}
