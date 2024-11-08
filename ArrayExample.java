package esakkiganesh;

public class ArrayExample {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array=new int[9][9];
		
    for(int i=0;i<9;i++)
    {
    	for(int j=0;j<9;j++)
    	{
         array[i][j]=(j+1);
         System.out.print(array[i][j]);
	    }
     	System.out.println(" ");  
      }
   /* array[1][8]=temp;
    int i=array.length-1;
    while(i>0) 
    {
    	array[i]=array[i-1];
    	i--;
    	
    }
    array[1][0]=temp;
    System.out.println(" ");
    
    for(int j=0;j<array.length;j++)
    {
    	System.out.print(array[i][j]+" ");
    }*/
    System.out.println("Inner  box of a Array");
   //for(int i=4;i>=array.length-5&&i<=array.length-3;i++)
    for(int i=7;i<=array.length;i++)
    {
    	for(int j=1;j<=6;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=7;k<=9;k++)
    	{
    		System.out.print(k);
    	}
    	System.out.println(" ");
    	
    	
    }
  }
}
