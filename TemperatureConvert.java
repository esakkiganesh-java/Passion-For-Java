package esakkiganesh;

import java.util.Scanner;

public class TemperatureConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemperatureConvert object = new TemperatureConvert();
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO TEMPERATURE CONVERTER..");
		int value = 0;
		Double temp = null ;
		int input = object.selectInput(value, sc);
		object.InputResponse(input);
	    Double temperature = object.GetUserInput(input,temp,sc);
	    object.solution(temperature,input);

	}

	private void solution(Double temperature,int input) {
		// TODO Auto-generated method stub
		if(input == 1) {
			System.out.println("Temperature in celcious: "+temperature);
			System.out.println("Temperature in fahrnheit: "+((temperature * 9/5) + 32));
			System.out.println("Temperature in kelvin : "+(temperature+273.15));
		}
		else if(input == 2)
		{
			System.out.println("Temperature in fahernheit: "+temperature);
			System.out.println("Temperature in celcious: "+((temperature - 32) * 5/9));
			System.out.println("Temperature in kelvin: "+((temperature - 32) * 5/9 + 273.15));
		}
		else if(input == 3)
		{
			System.out.println("Temperature in kelvin: "+temperature);
			System.out.println("Temperature in celcious: "+(temperature-273.15));
			System.out.println("Temperature in fahernheit: "+((temperature - 273.15) * 9/5 + 32));
		}
		
	}

	private Double GetUserInput(int input,Double temp,Scanner sc) {
		// TODO Auto-generated method stub
		if(input == 1) {
			System.out.println(" Enter the temperature in celcius: ");
			temp = sc.nextDouble();
			return temp;
		}
		else if(input == 2) {
			System.out.println(" Enter the temperature in Fahrenheit: ");
			temp = sc.nextDouble();
			return temp;
		}
		else if(input == 3) {
			System.out.println(" Enter the temperature in kelvin: ");
			temp = sc.nextDouble();
			return temp;
		}
		return temp;
		
	}

	private void InputResponse(int input) {
		// TODO Auto-generated method stub
		if(input == 1) {
			System.out.println(" You have selected the input format of celcious ");
		}
		else if(input == 2) {
			System.out.println(" you have selected the input format of Fahrenheit ");
		}
		else if(input == 3) {
			System.out.println(" you have selected the input format of kelvin ");
		}
		else {
			System.out.println("Please select valid input format( 1 , 2 , 3)..");
		}	
	}

	private static int selectInput(int value, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("please Select a input format");
		System.out.println("1 for celcius");
		System.out.println("2 for Fahrenheit");
		System.out.println("3 for kelvin");
		System.out.println("Enter the Input: ");
		 value = sc.nextInt();
		 return value;
		
	}

}
