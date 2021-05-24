import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter everything");
        String input = sc.nextLine();

        char character = (char) 255;
        int[] frequentestChar = new int[255];

        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            frequentestChar[ascii] += 1;
        }

        int max = 0;
        for (int j = 0; j < 255; j++) {
            if (frequentestChar[j] > max) {
                max = frequentestChar[j];
                character = (char) j;
            }
        }
        System.out.println(character + "-" + max);
    }
}
