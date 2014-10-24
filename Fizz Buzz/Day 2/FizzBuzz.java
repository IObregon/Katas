package prueba;

public class FizzBuzz {
	
	public String getResult(int number){
		if(number % 15 == 0 ) return "FizzBuzz";
		else if (number % 5 == 0) return "Buzz";
		else if(number % 3 == 0) return "Fizz";
		return Integer.toString(number);
	}

}
