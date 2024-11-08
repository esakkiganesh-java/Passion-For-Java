package esakkiganesh;

import java.util.Scanner;

public class ArrayDegreeRotation {
	public static void main(String[] args) {
		int [][] a = { { 1, 2, 3} ,// 7 4 1
				{4, 5, 6},          //8 5 2
				{7, 8, 9} };        //9 6 1
		int [][] rotation = new int[a.length][a[0].length];
		 System.out.println("Original Array : "); 
		 printArray(a);
		Scanner sc = new Scanner(System.in);
		int degree = DegreeofRotation(sc);
		CheckValidDegree(degree);
		int direction = getdirection(sc);
		CheckValidDirection(direction);
		System.out.println("After Rotation");
		Rotation(a ,rotation, degree, direction);
		
	}

	private static void Rotation(int[][] a,int[][] rotation, int degree, int direction) {
		// TODO Auto-generated method stub
		if( degree == 1 )
		{
			  if (direction == 1) {
				  for( int i = 0 ; i < a.length; i++)
				  {
					  for( int j = 0; j < a[0].length; j++)
					  {
						  rotation[i][j] = a[j][i];
					  }
				  }
				  for( int i = 0 ; i < a.length; i++)
				  {
					  for( int j = a.length-1; j >=0; j--)
					  {
						  
				          System.out.print(rotation[i][j]+" ");
					  }
					  System.out.println();
				  }
				
			   }
			  else if ( direction == 2)
			   {
				  for( int i = 0 ; i < a.length; i++)
				  {
					  for( int j = 0; j < a[0].length; j++)
					  {
						  rotation[i][j] = a[j][i];
					  }
				  }
				  for( int i = a.length-1 ; i >= 0; i--)
				  {
					  for( int j = 0; j < a[0].length; j++)
					  {
						  System.out.print(rotation[i][j]+" ");
					  }
					  System.out.println();
				  }
			  }
		}
			  
		else if ( degree == 2) {
			
			  if (direction == 1) {
				  
				  for( int i = 0; i < a.length; i++) 
				  {
					  for( int j = a[0].length - 1; j >= 0; j--) 
					  {
						  
					  }
			      }
			  for( int i = rotation[0].length - 1; i >= 0; i--)
			  {
				  for( int j = a.length - 1; j >= 0; j--)
				  {
					 System.out.print(a[i][j]+" ");
				  }
				  System.out.println();
			  }
	
		   }
			  else if ( direction == 2)
			   {
				  for( int i = 0; i < a.length; i++) 
				  {
					  for( int j = a[0].length - 1; j >= 0; j--) 
					  {
						  
					  }
			      }
			      for( int i = rotation[0].length - 1; i >= 0; i--)
			      {
				      for( int j = a.length - 1; j >= 0; j--)
				      {
					     System.out.print(a[i][j]+" ");
				      }
				      System.out.println();
			      }
	          }
		}
	else if ( degree == 3) {
			
		if (direction == 1) {
		    for( int i = 0 ; i < a.length; i++)
		    {
			  for( int j = 0; j < a[0].length; j++)
				 {
					rotation[i][j] = a[j][i];
				 }
			 }
			 for( int i = a.length-1 ; i >= 0; i--)
			 {
			    for( int j = 0; j < a[0].length; j++)
					{
					System.out.print(rotation[i][j]+" ");
					}
					System.out.println();
			  }
		 }
			  else if ( direction == 2)
			   {
				  for( int i = 0 ; i < a.length; i++)
				  {
					  for( int j = 0; j < a[0].length; j++)
					  {
						  rotation[i][j] = a[j][i];
					  }
				  }
				  for( int i = 0 ; i < a.length; i++)
				  {
					  for( int j = a.length-1; j >=0; j--)
					  {
						  
				          System.out.print(rotation[i][j]+" ");
					  }
					  System.out.println();
				  }
			   }
            }
	}
		
	
		

	private static void CheckValidDirection(int direction) {
		// TODO Auto-generated method stub
		if( direction == 1) {
			System.out.println("Array Rotating clockwise");
		}
		else if( direction == 2)
		{
			System.out.println("Array Rotating anti Clockwise");
		}
		else {
			System.out.print("Invalid Direction ");
		}
		
	}

	private static int getdirection(Scanner sc) {
		// TODO Auto-generated method stub
		int direction = sc.nextInt();
		return direction;
	}

	private static void CheckValidDegree(int degree) {
		// TODO Auto-generated method stub
		if( degree > 3  || degree < 1)
		{
			System.out.println("Invalid Degree");
		}
		else {
			System.out.println(" Enter the direction");
			System.out.println(" 1 for Clockwise");
			System.out.println(" 2 for antiClockwise");
			System.out.println(" Enter the direction: ");
		}
		
	}

	private static int DegreeofRotation(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Degree for Rotation");
		System.out.println(" 1 for 90");
		System.out.println(" 2 for 180");
		System.out.println(" 3 for 270");
		System.out.println("Enter the Degree : ");
		int getdegree = sc.nextInt();
		return getdegree;
			
	}

	private static void printArray(int[][] a) {
		// TODO Auto-generated method stub
		for( int i = 0; i < a.length; i++)
		{
			for( int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
