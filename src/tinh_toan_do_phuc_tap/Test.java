package tinh_toan_do_phuc_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();

        int[] listChar = new int[255];
        for (int i = 0; i < input.length(); i++) {
            // tim vi tri tuong ung cua ky tu trong bang ma ASCII;
            int asc = (int) input.charAt(i);

            // tang gia tri tan suat;
            listChar[asc] += 1;

            // tim ky tu xuat hien nhieu nhat;
            int max = 0;
            char character = (char) 255;
            for (int j = 0; j < 255; j++) {
                if (listChar[j] > max) {
                    max = listChar[j];
                    character = (char) j;
                }
            }
            System.out.println("The most appearing letter is: " + character + " with a frequency of " + max + " times");
        }
    }
}
// bai nay chua hieu tinh toan do phuc tap;
