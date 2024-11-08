package esakkiganesh;

public class StringEvenWords {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s= "I Am Angry";
		EvenWordOfString(s);

	}
private static void EvenWordOfString(String s)
	{
		  for (String word : s.split(" ")) 
		  {
		   if (word.length() % 2 == 0) 
		   {
		    System.out.println(word); 
		   }
		 } 	
	}

}
