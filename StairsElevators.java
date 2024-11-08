package esakkiganesh;

public class StairsElevators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floors = 2;
		int stvelocity = 10;
		int elevelocity = 14;
		double sqrt2 = Math.sqrt(2);
		double time1 = sqrt2 * floors/stvelocity ;
		double time2 =  2 * floors / elevelocity ;
		if( time1 < time2) {
			System.out.print("Stairs");
		}
		else {
			System.out.print("Elevators");
		}
		
	}

}
