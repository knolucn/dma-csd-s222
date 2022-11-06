package git_example;

import java.util.Scanner;

public class TryMe {
	public static void main(String[] args) {
		System.out.print("Anna");
		System.out.print("Say a word: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println("Hello, " + word + "!");
		System.out.println("End another way.");
	}
}
