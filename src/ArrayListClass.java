import java.util.*;

public class ArrayListClass {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n!=1) {
		System.out.println("Select one option:");
		System.out.println("[1] Given a positive number tells how many even digit has the number");
		System.out.println("[2] Given a sentence and a letter it gives the number of words of the sentence that begins with that letter.");
		System.out.println("[3] Given a sentence and a letter it gives the number of words of the sentence that ends with that letter.");
		int option = sc.nextInt();
		switch (option) {
		//if the user enters 0 the program will stop
		case 0:
			n=1;
			System.out.println("The program has been stopped.");
			break;
		case 1: 
			System.out.println("**EVEN NUMBERS**");
			System.out.println("Enter a number:");
			Integer a = sc.nextInt();
			//to be sure the number is positive
			while (a < 0) {
				System.out.println("Enter a positive number:");
				a = sc.nextInt();
			}
			//convert the number to a String
			String number = a.toString();
			//save it in a array
			char numbers[] = number.toCharArray();
			ArrayList<Character> numbersList = new ArrayList<Character>();
			for (int i = 0; numbers.length>i; i++) {
				numbersList.add(numbers[i]);
			}
			int counter = 0;
			//create a loop
			for(int i=0;numbersList.size()>i; i++) {
				//to check if each number is
				switch (numbersList.get(i)) {
				//even
				case '0': case '3': case '5': case '7': case '9': 
					break;
				//or odd
				case '2': case '4': case '6': case '8':
					counter++;
					break;
				}
			}
			System.out.println(number +" has "+ counter + " even digits.");
			break;
		
		case 2:
			System.out.println("**NUMBER OF WORDS THAT STARTS WITH**");
			System.out.println("Enter a sentence:");
			//needed to put this to scan the sentence
			sc.nextLine();
			String sentence = sc.nextLine();
			String[] words = sentence.split(" ");
			ArrayList<String> wordsList = new ArrayList<String>();
			for (int i=0; i<words.length;i++ ) {
				wordsList.add(words[i]);
			}
			System.out.println("Enter a letter");
			char letter=sc.next().charAt(0);
			int times=0;
			for (int i = 0; i<wordsList.size();i++) {
				if (wordsList.get(i).charAt(0) == letter) {
					times++;
				}
			}
			System.out.println("This sentence has "+times+ " words that starts with " +letter);
			break;
		case 3:
			System.out.println("**NUMBER OF WORDS THAT FINISHES WITH**");
			System.out.println("Enter a sentence:");
			//needed to put this to scan the sentence
			sc.nextLine();
			String sentence2 = sc.nextLine();
			//String[] word = new String[total];
			String[] words2 = sentence2.split(" ");
			ArrayList<String> words2List = new ArrayList<String>();
			for (int i = 0; i<words2.length;i++) {
				words2List.add(words2[i]);
			}
			int total2 = words2.length;
			System.out.println("Enter a letter");
			char letter2=sc.next().charAt(0);
			int times2=0;
			for ( int i = 0; i<total2;i++) {
				if (words2[i].charAt(words2[i].length()-1) == letter2) {
					times2++;
				}
			}
			System.out.println("This sentence has "+times2+ " words that finishes with " +letter2);
			break;
		default:
			//to make the user choose one of the numbers we want
			System.out.println("Enter a valid number");
			option=sc.nextInt();
			break;
		}
		}
		sc.close();
	}
}
