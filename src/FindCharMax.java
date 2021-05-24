import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindCharMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Enter everything");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast()
                    && list.contains(input.charAt(i))) {
                list.clear();
            }
            list.add(input.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character cha :
                max) {
            System.out.print(cha);
        }
        System.out.println();
    }
}
