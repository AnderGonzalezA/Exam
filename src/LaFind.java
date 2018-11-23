import java.util.Scanner;
public class LaFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence=sc.nextLine();
		char[] letters = sentence.toCharArray();
		for (int i=0;i<letters.length;i++) {
			if (letters[i]=='l'&&letters[i+1]=='a') {
				System.out.println(i);
			}
		}
		sc.close();
	}
}