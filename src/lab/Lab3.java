package lab;

public class Lab3 {

	public static void main(String[] args) {
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = -3;
		array[4] = 13;
		array[5] = 6;
System.out.println(array[0]);
System.out.println(array[array.length - 1]);
//System.out.println(array[6]);
//System.out.println(array[-1]);	
	for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
	}
	System.out.println("=========");
for (int number : array) {
	System.out.println(number);
}
	double sum = 0;
	for (int number : array) {
		sum += number;
	}
	System.out.println(sum);
	
	double average = sum / array.length;
	System.out.println(average);
	for (int number : array) {
		if (number % 2 != 0) {
			System.out.println(number);
		}
	}
	String [] names = {"Sam", "Sally", "Thomas", "Rober"};
	int letterSum = 0;
	for (String name : names) {
		letterSum += name.length();
	}
	greet("Tom");
	greet("Sally");
	String greeting = greet2("Nick");
	System.out.println(greeting);
	// type mismatch. 
	System.out.println(isStringLongerThanNumber ("Hello", 3));
	System.out.println(doesArrayContainString(names, "Sam"));
	System.out.println(findSmallest(array));
	double[] doubles = {45.7, 30.2, 67.3};	
	System.out.println(calculateAvg(doubles));
	int[] nameLengths = extractStringLength(names);
	for (int number : nameLengths) {
		System.out.println(number);
	}
	System.out.println(hasMoreEvenWordCharacters(names));
	System.out.println(isPall("racecar"));
	
	
	}
	
public static boolean isPall(String string) {
	for (int i = 0; i < string.length() / 2; i++) {
		if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
			return false;
		}
	}
	return true;
}
	
	
public static boolean hasMoreEvenWordCharacters(String[] array) {
	int evenLetters = 0;
	int oddLetters = 0;
	
	for (String string : array) {
		if (string.length() % 2 == 0) {
			evenLetters += string.length();
		}else {
			oddLetters += string.length();
		}
	}
	return evenLetters > oddLetters;
	
}
	
public static void greet(String name) {
	System.out.println("Hello, " + name + "!");
}
	public static String greet2 (String name) {
		return "Hi, " + name + "!";
	}		
public static boolean isStringLongerThanNumber(String string, int number) {
	return string.length() > number;
}
public static boolean doesArrayContainString(String[] array, String string){
	for (String str : array) {	
		if (str.equals(string)) {
			return true;
		
		}
	}
	return false;
	
	}

public static int findSmallest(int[] numbers) {
	int smallest = numbers[0];
	for (int number : numbers) {
		if (number < smallest) {
			smallest = number;
			
		}
	}
	return smallest;
	}
public static double calculateAvg(double[] array) {
	double sum = 0;
	for(double number : array ) {
		sum += number;
	}
	return sum / array.length;

	}
public static int[] extractStringLength(String[] strings) {
	int[] results = new int [strings.length];
	for (int i = 0; i < strings.length; i++) {
		results[i] = strings[i].length();
	}
	return results;
	}

}
