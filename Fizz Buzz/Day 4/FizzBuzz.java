package prueba;

public class FizzBuzz {

	public String getResult(int number) {
		if (isDivisibleBy15(number)) return "FizzBuzz";
		else if (isDivisibleBy3(number)) return "Fizz";
		else if (isDivisibleBy5(number)) return "Buzz";
		return String.valueOf(number);
	}
	
	private boolean isDivisibleBy3 (int number){
		return (0 == number % 3);
	}
	
	private boolean isDivisibleBy5 (int number){
		return (0 == number % 5);
	}
	
	private boolean isDivisibleBy15 (int number){
		return (0 == number % 15);
	}
}
